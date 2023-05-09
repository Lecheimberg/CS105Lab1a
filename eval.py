import subprocess
import os


def remove_main(file_path):
    try:
        os.remove(file_path)
        print(f"File deleted successfully: {file_path}")
    except OSError as e:
        print(f"Error deleting file: {e.filename} - {e.strerror}")


def run_job(cmd):
    current_directory = os.getcwd()
    ret = subprocess.run(
        cmd,
        shell=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        cwd=current_directory,
    )
    return ret.stdout.decode(("UTF-8"))


if __name__ == "__main__":
    # Compile
    run_job("javac src/Main.java")

    # Run
    msg = run_job("java -cp src Main").rstrip()
    expected_output = "Hello Ensign!"
    if msg == expected_output:
        print("Ok!")
        remove_main("src/Main.class")
    else:
        print("Error. The correct answer is `Hello Ensign!`, but your output is:")
        print("```")
        print(msg)
        print("```")
        remove_main("src/Main.class")
