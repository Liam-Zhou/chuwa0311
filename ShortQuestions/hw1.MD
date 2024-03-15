1.  Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
2.  practice git using the platform. list the git commands you learned


```
git branch
git checkout
git init
git add
git commit
git push
git pull
git merge
```

3.  What is the basic steps to init a git repo in you local ?

```
create repo folder
git init
git add .
git commit
```

4.  How to clone a repo from Github ?

>git clone github_link

5.  How to create a new branch and checkout to that branch ?

```
git branch branch_name
git checkout branch_name
```

6.  How to merge the branch_test to master branch in command ? show me the commands

```
git checkout master
git fetch
git merge branch_test
```

7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
    checkout back to **branch_learn_stash ? try commands way and intellij way.

```
git stash
git checkout another_branch
git checkout branch_learn_stash
git stash pop
```

8.  How do you understand PR is based on Branch?

A Pull Request propose changes from a specific branch. When pull request is called. We hope to merge a side branch to main branch. 
PR provides a platform for code review and to approve changes.
 
9.  What is maven role ? what it be used to do ?

Maven is a Java project management and build automation tool. It manages java dependencies and plugins and automate build lifecycles.

10.  What is the lifecycle of maven? could you tell me the details ?

The lifecycle is a set of phrases in Java project build. Each phase is responsible for a specific task in the build process. 
The lifecycle phases are executed sequentially. They include clean, validate, compile, test, package, verify, install, deploy.

11.  what is the difference between package and install in maven lifecycle ?

Package takes the compiled code and package it in its distributable format, such as a JAR.

Install installs the package into the local repository, for use as a dependency in other projects locally

12.  What is plugins in maven, list some plugins.

Maven is, at its heart, a plugin execution framework; all work is done by plugins. Plugins provide functionality and features to the core Maven build lifecycle.

examples:
* Compiler Plugin
* JAR Plugin
* Javadoc Plugin
* Surefire Plugin
* Dependency Plugin
