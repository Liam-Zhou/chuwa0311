## 1. Markdown Basic Usage
Please check [README.md](./README.md)

## 2. Git Basics
- `git clone <repo url>`: clone a repository to local
- `git init`: init git workflow for current project

- `git commit -m "<commit message>"`: commit current staged files and ready to push with a commit message. 
- `git add <file path>`: stage changes in one file
- `git add .`: stage all changes
- `git commit -am "<commit message>"`: combine `git commit -m` & `git add .`
- `git branch <new branch name>`: create a new branch based on current branch
- `git checkout <branch name>`: checkout to another branch
- `git rebase <branch name>`: rebase current branch to another branch
- `git pull`: pull a remote branch
- `git push`: push the current branch to remote
- `git stash`: stash current changes
- `git stash pop`: pop out staged changes
- `git cherrypick <commit id>`: cherry pick past commits
- `git merge <branch>`: merge <branch> into current branch
- `git status`: list all files status

## 3. What is the basic steps to init a git repo in you local ?
Go to the local repo and run the command `git init`

## 4. How to clone a repo from Github ?
Setup ssh key, and run `git clone <web url or ssh key>`

## 5. How to create a new branch and checkout to that branch ?
use command `git branch <branch name>` to create a new branch, use command `git checkout <branch name>` to checkout to that branch

## 6.  How to merge the branch_test to master branch in command ? show me the commands
use command `git checkout master` and `git merge branch_test`

## 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
command way: `git stash` & `git stash pop`

intellij way: shelve changes & unshelve changes

## 8.  How do you understand PR is based on Branch?
It means when we create a PR, the changes we are going to  include in the PR are from the PR branch. For example, when we are going to merge new features in to the `master`branch, we need to create a PR from branch `feature`.

## 9.  What is maven role ? what it be used to do?
Maven is a build automation tool used for Java projects, though. It can help for dependencies management and build process.

## 10.  What is the lifecycle of maven? could you tell me the details ?
Maven lifecycle is the varying phases the program would go through during the building process. There are several typical lifecycles: clean -> prepare-resources -> validate -> compile -> test -> package -> install -> deploy. 

## 11.  what is the difference between package and install in maven lifecycle ?
Both `package` and `install` are involved in preparing artifacts for deployment, `package` focuses on creating the artifact, meanwhile `install` installs the artifact into the local repository. 

## 12.  What is plugins in maven, list some plugins.
Plugings in maven are pieces of softwares could be managed and used by Maven, they can help for achieving functionalities and program goals. Example plugins:
- `maven-dependency-plugin`: Dependency Plugin, analyze and manage plugins.
- `maven-clean-plugin`: Clean Plugin, deletes output directories and other generated files.
- `maven-deploy-plugin`: Deploy Plugin, deploy to remote repo. 
## 13.  In Repo/MavenProject directory, create a maven Module using Intellij, named it as belows:
1.  groupID: com.chuwa.learn 

2.  artifactID: java-core 

Please check the derectory Repo/MavenProject

## 14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.
Comments left. 