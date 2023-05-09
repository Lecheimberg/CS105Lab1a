import subprocess

def run_job(cmd):
    ret = subprocess.run(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    return ret.stdout.decode(('UTF-8'))

if __name__ == '__main__':
    # Compile
    run_job("javac Main.java")

    # Run
    msg = run_job("java Main").rstrip()
    expected_output = "Hello World!"
    if msg == expected_output:
        print("Ok!")
    else:
        print("Error. The correct answer is `Hello World!`, but your output is:")
        print("```")
        print(msg)
        print("```")