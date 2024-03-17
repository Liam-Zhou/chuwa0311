Write your hw1 in hw1.md
### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formattin
g-on-github/basic-writing-and-formatting-syntax
### 2. practice git using the platform. list the git commands you learned: https://learngitbranching.js.org/
```
git commit
git checkout
git branch
git merge
git rebase
^ operator
~ operator
~ operator
git branch -f
git reset
git revert
git cherry-pick
git rebase -i
```

### 3. What is the basic steps to init a git repo in you local ?
```
git init
git add .
git commit -m "message"
```
### 4. How to clone a repo from Github ?
git clone repo_url
### 5. How to create a new branch and checkout to that branch ?
git checkout -b new_branch
### 6. How to merge the branch_test to master branch in command ? show me the commands
```
git checkout master
git merge branch_test
```
### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
- commands
```
git checkout branch_learn_stash
git stash
git stash pop
git stash apply                 
```
- intellij
go to stash changes part and save stach
### 8. How do you understand PR is based on Branch?
A Pull Request is like a proposal for changes from one branch to another within a repository. The PR starts from a branch that has the new changes  and targets another branch where these changes are intended to be merged. This way, the team can review, discuss, and eventually integrate the new changes from the feature branch into the main codebase, ensuring everything works smoothly together.

### 9. What is maven role ? what it be used to do ?
Essentially, Maven's role is to help manage a project's build process. It can be used to download libraries and plugins, build lifecycle, and standarize project structures.
### 10. What is the lifecycle of maven? could you tell me the details ?
validate: Validates that the project is correct and all necessary information is available.

compile: Compiles the source code of the project.

test: Tests the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed.

package: Takes the compiled code and packages it in its distributable format, such as a JAR.

verify: Runs any checks to verify the package is valid and meets quality criteria.

install: Installs the package into the local repository, for use as a dependency in other projects locally.

deploy: Done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

### 11. what is the difference between package and install in maven lifecycle ?
In Maven's default lifecycle, the package phase compiles and packages the project's code into a distributable format, ready for distribution or deployment, but does not make it available outside the project. The install phase follows package and goes a step further by installing the package into the local Maven repository on your machine, making it accessible as a dependency for other projects locally. Essentially, package prepares your project's artifact for use, while install makes it easily reusable across multiple projects on your local development environment.

### 12. What is plugins in maven, list some plugins.
Plugins are tools that provide specific tasks for project building, packaging, and management. 

Examples:
```
Maven Compiler Plugin
Maven Surefire Plugin
Maven JAR Plugin
Maven Clean Plugin
```

### 13. In Repo/MavenProject directory, create a maven Module using Intellij, named it as belows:
  - 1. groupID: com.chuwa.learn
  - 2. artifactID: java-core
### 14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.
