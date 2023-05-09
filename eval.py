name: Java CI

on:
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 11
      uses: actions/setup-java@v2
      with:
        java-version: '11'
        distribution: 'adopt'

    - name: Compile and run HelloWorld.java
      run: |
        javac src/Main.java
        echo "Hello World!" > expected_output.txt
        java Main > actual_output.txt
        diff expected_output.txt actual_output.txt
