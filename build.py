import argparse
import os
import shutil
import subprocess
import sys

# run command function
def run_cmd(cmd, cwd=None):
    try:
        print(f"> {' '.join(cmd)}")
        subprocess.run(cmd, check=True, cwd=cwd)
    except subprocess.CalledProcessError as e:
        print(f"[ERROR] Command failed: {' '.join(cmd)}")
        print(f"[ERROR] Return code: {e.returncode}")
        sys.exit(e.returncode)
    except FileNotFoundError as e:
        print(f"[ERROR] Command not found: {cmd[0]}")
        sys.exit(1)
# function to use gradlew.bat on windows and such not giving a WinError 193 not a valid Win32 application
def gradle_cmd():
    return "gradlew.bat" if os.name == "nt" else "./gradlew"

def clean():
    run_cmd(["./gradlew", "clean"])
    print("Clean complete.")

def build_all():
    run_cmd([gradle_cmd(), "fabric:build"])
    run_cmd([gradle_cmd(), "neoforge:build"])
    print("fabric and neoforge build have been ran, if any errors occurred check the errors above for more details")

def build_neoforge():
    run_cmd([gradle_cmd(), "neoforge:build"])
    print("neoforge build hasbeen been ran, if any errors occurred check the errors above for more details")
def build_fabric():
    run_cmd([gradle_cmd(), "fabric:build"])
    print("fabric build hasbeen been ran, if any errors occurred check the errors above for more details")


def main():
    parser = argparse.ArgumentParser(description="Tin utilities Minecraft mod build script")
    parser.add_argument("--build", action="store_true", help="Build all modules")
    parser.add_argument("--clean", action="store_true", help="Clean the project binaries")
    parser.add_argument("--fabric", action="store_true", help="Build Fabric mod")
    parser.add_argument("--neoforge", action="store_true", help="Build Neoforge mod")
    args = parser.parse_args()

    try:
        if args.clean:
            clean()
        if args.build:
            build_all()
        if args.fabric:
            build_fabric()
        if args.neoforge:
            build_neoforge()
        if not (args.build or args.clean or args.fabric or args.neoforge):
            parser.print_help()
    except KeyboardInterrupt:
        print("\n[INFO] Interrupted by user.")
        sys.exit(0)

if __name__ == "__main__":
    main()