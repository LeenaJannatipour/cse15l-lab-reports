# How to log into a course-specific account on ieng6:
  # Installing VS Code
   1) Go to the Visual Studio Code Installation website - [https://code.visualstudio.com](https://code.visualstudio.com/)
   2) Follow the installation instructions carefully for your specific operating system (Windows/PC or Mac)
       - For mac users, make sure it shows up as an application in your Finders application folder (see below)
        ![Image](http://url/VSCodeApplications.png)
   3) Launch a new VSCode window after installation and make sure it looks something like this --> ![Image](http://url/VSCodeWindow.png)     
  # Remotely Connecting  
   - We can use the VSCode terminal to connect remotely to a computer in the CSE basement in order to access course-specific content.
   1) With a new VSCode window open, open a new file with a name of your choice
   2) Navigate to a new terminal by clicking the terminal drop-down menu where you will see "New Terminal". 
      Should look like this --> ![Image](http://url/NewTermButton.png)
      - Make sure you are using a "bash" terminal
   3) Using your course-specific account name, enter this code into the terminal -->
    $ ssh cs15lsp23kd@ieng6.ucsd.edu
    ![Image](http://url/sshtermoutput.png)
      - replace the "kd" with your course-specific account letters, should always be "cs15lsp23##@ieng6.ucsd.edu" where ## are changed
   4) You will most likely get an error message the first time, followed by a confirmation to continue connecting --> type "Yes" & press Enter
   5) Enter your password and press enter.
       - Forgot Password? Go to this link to reset password with your associated ieng6 account -- [https://sdacs.ucsd.edu/~icc/index.php](https://sdacs.ucsd.edu/~icc/index.php)
   - This is the expected output --> ![Image](http://url/afterpassword.png)
   Congratulations! You are now connected to a university computer in the CSE building basement!!
  # Trying Some Commands
   1) There are a couple of commands you can try once you are in the remote server! Try typing any of these commands into the terminal to see the output --
      - cd ~
      - cd
      - ls -lat
      - ls -a
      - pwd
      - mkdir
      - cp
    2) To exit the terminal --> Ctrl-D or run command "exit"
   # Example of running a command in terminal of your remote server:
   ![Image](http://url/remotecommands.png) (As you can see here, I run 6 different commands, but only 2 of them gave an output)
   
