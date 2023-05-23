# Lab Report 4
## Using vim to edit java files
### Logging into ieng6
- Open Lab 7 repository in VS Code via Github Desktop
- Open a new bash terminal and input the ieng6 remote server account
```
$ ssh cs15lsp23kd@ieng6.ucsd.edu
```
![ssh remote server Login](lab7sshlogin.png)
### Clone your fork of the repository from your Github account
- Once you are in ieng6, change the directory into lab7 
```
$ cd lab7
```
- Then, clone your fork of the repository from the command line
```
$ git clone https://github.com/LeenaJannatipour/lab7
```
![Clone my fork of the repository from terminal](lab7gitclone.png)

### Run the tests, demonstrating that they fail
- Before fixing the bug in the code, we run the JUnit tests
![Running tests with a bug in the code](lab7testfailures.png)


### Edit the code file to fix the failing test
- To edit the code in the terminal, we can use vim to edit the ListExamples java file 
```
$ vim ListExamples.java
```
- Once in vim, we can search for the bug by typing "/index1" (like the picture below) to get every occurrence of index1 in this file through vim
![After the above input, we can see the ListExamples file in the terminal](lab7vimstep1.png)
- Pressing n to get to the correct bug, we can change "index1" to "index2" so the tests correctly run
![Searching for all occurrences of index1](lab7vimstep2.png)
![After fixing the bug in the merge method](lab7vimfix.png)

### Run the tests, demonstrating that they now succeed
- After saving the vim file editing by typing ":wq" + Enter, we can run the JUnit test file again
![Successful Test Run after fixing bug](lab7testsuccess.png)


### Commit and push the resulting change to your Github account

![Commit the changed file to Github through Github Desktop](lab7maincommit.png)
