## 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

## 2.  Practice git using the platform. list the git commands you learned
git clone, git init, git status, git commit, git pull, git push, git merge, git stash, git stash pop, git branch, git checkout

## 3.  What is the basic steps to init a git repo in you local ?
run 'git init' in the terminal

## 4.  How to clone a repo from Github ?
git clone [URL]

## 5.  How to create a new branch and checkout to that branch ?
git checkout -b [branch name]

## 6.  How to merge the branch_test to master branch in command ? show me the commands
1. git checkout master
2. git pull origin master
3. git merge branch_test

## 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.
commands way:
1. git stash 
2. git checkout [other branch]
3. git checkout branch_learn_stash
4. git stash pop.
intellij way:

## 8.  How do you understand PR is based on Branch?
A PR is a way to merge changes, it requests to merge one branch into another

## 9.  What is maven role ? what it be used to do ?
Maven is a build automation tool used primarily for Java projects. It handles project building, dependency management, and project information management.

## 10.  What is the lifecycle of maven? could you tell me the details ?
1. Prepare-resources: Resource copying can be customized in this phase 
2. Validate: Validates if the project is correct and if all necessary information is available
3. Compile: Source code compilation is done in this phase
4. Test: Tests the compiled source code suitable for testing framework
5. Package: This phase creates the JAR/WAR package as mentioned in the packaging in POM.xml
6. Install: This phase installs the package in local/remote maven repository
7. Deploy: Copies the final package to the remote repository

## 11.  what is the difference between package and install in maven lifecycle ?
'package' creates the JAR/WAR package as mentioned in the packaging in POM.xml, and 'install' installs the package in local/remote maven
repository.

## 12.  What is plugins in maven, list some plugins.
Plugins are tools that provide specific goals to fulfill requirements of building and managing a project.
For example, Maven compiler plugin compiles Java sources.
Maven JAR Plugin packs the compiled project files into a JAR file.
Maven Clean Plugin cleans up the project’s directory by removing build files generated at build-time.
## 13.  In Repo/MavenProject directory, create a maven Module using Intelli

## 14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.