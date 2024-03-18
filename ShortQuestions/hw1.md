# Homework 1

#### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

[README.md](hw1/README.md)

#### 2. Practice git using the platform. List the git commands you learned

```
git init
git add .
git status
git commit -m ""
git push
git pull
git branch
git checkout -b <branch_name>
git merge
git rebase
git log
git reset
git fork
git fetch
```

#### 3. What is the basic steps to init a git repo in your local?

```
git init
git add.
git commit -m "commit message"
```

#### 4. How to clone a repo from Github?

```
git clone <url>...
```

#### 5. How to create a new branch and checkout to that branch?

```
git branch <branch name>
git checkout -b <new_branch>
```

#### 6. How to merge the branch_test to master branch in command? show me the commands

```
git checkout master
git merge branch_test
```

#### 7. How to **stash** your new code before leaving branch **branch_learn_stash** and pop your stash when you checkout back to branch_learn_stash? try commands way and intellij way.

- Commands
```
git checkout branch_learn_stash
git stash
git checkout branch_learn_stash
git stash pop
```
- Intellij
`Stash Changes`
`Unstash Changes` 

#### 8. How do you understand PR is based on Branch?

A Pull Request (PR) is a mechanism used to propose and request the merging of one branch into another. It enables developers to submit their changes for review by others before integration, ensuring collaborative inspection and improvement of the codebase.

#### 9. What is maven role? what it be used to do?

Maven role includes project building, dependency management, projects Standardization, information management. It is used to simplify project setup and management.

#### 10. What is the **lifecycle** of maven? could you tell me the details ?

The lifecycle is a set of phrases in Java project build. Each phase is responsible for a specific task in the build process. The lifecycle phases are executed sequentially. They include `clean`, `validate`, `compile`, `test`, `package`, `verify`, `install`, `deploy`.

#### 11. what is the difference between **package** and **install** in maven lifecycle ?

`package`: package the project into a distributable format, such as a JAR.

`install`: install the package into the local repository, for use as a dependency in other projects locally.

#### 12. What is **plugins** in maven, list some plugins.

Plugins are used to perform specific tasks as part of the build process.

```
Maven Compiler Plugin
Maven Surefire Plugin
Maven Install Plugin
Maven JAR Plugin
Maven Clean Plugin
```

#### 13. In **Repo/MavenProject** directory, create a **maven Module** using Intellij, named it as belows:

1. groupID: **com.chuwa.learn**
2. artifactID: **java-core**


#### 14. Do **Code Review**: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please **don't** merge it.