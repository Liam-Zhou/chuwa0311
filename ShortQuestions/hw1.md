###Question1:
```
In ShortQuestions/README.md

```

###Question2: practice git using the platform. list the git commands you learned
```
1. git commit
2. git branch <name>
3. git checkout <name>
4. git commit
5. git merge <name>
6. git rebase<main>
7. git checkout HEAD^
8. git reset
9. git revert
10. git cherry-pick
11. git tag

```

###Question3: What is the basic steps to init a git repo in you local ?
```
git init

```

###Question4: How to clone a repo from Github ?
```
git clone <repository-url>

```

###Question5: How to create a new branch and checkout to that branch ?
```
git branch <branch name>
git checkout <branch name>

```

###Question6: How to merge the branch_test to master branch in command ? show me the commands
```
git checkout master
git merge branch_test

```

###Question7: How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way
```
git checkout branch_learn_stash
git stash
git check out main
git check out branch_learn_stash
git stash pop

```

###Question8: How do you understand PR is based on Branch?
```

PR is the pull request, which is used when we want to merge one branch to
another and ask others to review the changes.

```

###Question9: What is maven role ? what it be used to do ?
```

Maven role includes: manage dependencies, build project, documentation, reporting
It is used to simplify project setup and management.

```

###Question10: What is the lifecycle of maven? could you tell me the details ?
```

Clean -> prepare-resources -> validate -> package -> install
1. removes files generated at build-time
2. copy resources to the output directory to make sure that resources are in the correct place ofr packaging
3. validate the project configuration
4. takes the compiled code and packages it in distributable format
5. install the package into the locak maven repository


```

###Question11:  what is the difference between package and install in maven lifecycle ?
```
package will take the compiled code and packages it in to distributable format like JAR/WAR
install will install the package.

```

###Question12:  What is plugins in maven, list some plugins.
```
Plugins are the primary way of adding new functionality to the build process.
Examples:
1. maven compiler plugin
2. maven JAR plugin
3. maven WAR plugin
4. maven install plugin
5. maven deploy plugin

```