1. Learn **_MarkDown_** and show all of basic usage in the **_ShortQuestions/README.md_**

2. List the git commands

```
git init
git status
git add <file|folder>
git commit -m "message" <--amend>
git log --all --graph
git reset
git branch <branch_name>
git branch -D <branch_name>
git checkout <branch_name>
git remote -v
git push <remote_name> <branch>
git clone
git fetch
git pull
```

3. What is the basic steps to init a git repo in you local ?

```
cd repo_dir
git init
git add .
git commit -m "initial commit"
```

4. How to clone a repo from Github ?

```
git clone <repo_url>
```

5. How to create a new branch and checkout to that branch ?

```
git checkout -b <branch_name>
```

6. How to merge the branch_test to master branch in command ? show me the commands

```
git checkout master
git merge branch_test
```

7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
   checkout back to branch_learn_stash ? try commands way and intellij way.

```
git stash push
git checkout another_branch
git checkout branch_learn_stash
git stash pop
```

8. How do you understand PR is based on Branch?

A PR is a mechanism to merge changes from one branch (source) into another (target) within a repository.

9. What is maven role ? what it be used to do ?

Maven is a build automation tool used primarily for Java projects. It manages project builds, dependencies, and documentation.

10. What is the lifecycle of maven? could you tell me the details ?

The Maven lifecycle consists of phases for building software: validate, compile, test, package, verify, install, and deploy, executed sequentially to complete the build process.

11. what is the difference between package and install in maven lifecycle ?

Package: Compiles code and generates a JAR/WAR file

Install: Places the generated package into the local Maven repository

12. What is plugins in maven, list some plugins.

Maven plugins are tools that add capabilities to the Maven build process, such as compiling code and packaging artifacts. Examples include:

maven-compiler-plugin: Compiles Java source code.

maven-surefire-plugin: Runs unit tests.

maven-jar-plugin: Packages code into a JAR file.

maven-war-plugin: Creates web application WAR files.

maven-install-plugin: Installs artifacts into the local repository.

maven-deploy-plugin: Deploys artifacts to a remote repository.
