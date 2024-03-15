# A first-level heading
## A second-level heading
### A third-level heading

**This is bold text**
_This text is italicized_
~~This was mistaken text~~
**This text is _extremely_ important**
***All this text is important***
This is a <sub>subscript</sub> text
This is a <sup>superscript</sup> text
> Text that is a quote
Use `git status` to list all new or modified files that haven't yet been committed.
Some basic Git commands are:
```
git status
git add
git commit
```

# 2. Git commands learned
```
git init
git status 
git add .
git commit -m "some message"
git push origin master/main
git stash
git stash pop
git branch branch_name
git checkout branch_name
git checkout -b branch_name # create and checkout to branch_name
# Git Remote
git remote -v
origin  https://github.com/TAIsRich/chuwa-eij.git (fetch)
origin  https://github.com/TAIsRich/chuwa-eij.git (push)
upstream  https://github.com/B1gO/Everything-In-Java.git (fetch)
upstream  https://github.com/B1gO/Everything-In-Java.git (push)
git remote add upstream https://github.com/B1gO/Everything-In-Java.git
git remote add upstream https://github.com/B1gO/Everything-In-Java11.git
git remote add upstreamWhateverName https://github.com/B1gO/Everything-In-Java11.git
git add "localfiles.java"
git commit -m 'something'
git push 
```

# 3. What is the basic steps to init a git repo in you local 
Using `git init` command to initialize, `git add .` to add files to the staging area, `git commit -m` to commit changes

# 4. How to clone a repo from Github ?
Using `git clone` command

# 5. How to create a new branch and checkout to that branch ?
Using `git checkout -b` command

# 6. How to merge the branch_test to master branch in command ? show me the commands
First of all, you need to be on the branch that you want to merge into using `git checkout master`, then use `git pull origin master` to update master branch. Next, use `git merge branch_test` to perform the merge. Lastly, `git push origin master` push changes to the remote

# 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash? try commands way and intellij way.
command: `git stash` & `git stash pop`

intellij: shelve changes & unshelve changes

# 8. How do you understand PR is based on Branch?
That usually means we need to use PR to merge changes on a dev branch to the production branch in order to make changes live on the production environment. For example, I pulled the master branch, which is the production branch, and I want to develop some new features, so I created a new branch called dev, and features are developed on this dev branch. After the development is done, I raise a PR to notify the team to review the code, and in the end, merge everything to the master.

# 9. What is maven role ? what it be used to do ?
Maven serves as an essential tool in a Java developer's toolkit, significantly easing the process of building, managing dependencies, and standardizing Java projects.

# 10. What is the lifecycle of maven? could you tell me the details ?
Maven lifecycle comprise multiple phases a project would go through during the building process. There are several stages: clean -> prepare-resources -> validate -> compile -> test -> package -> install -> deploy. 

# 11. what is the difference between package and install in maven lifecycle ?
In summary, the package phase is about creating the distributable format of your application, while the install phase is about placing that distributable in your local Maven repository. 

# 12. What is plugins in maven, list some plugins.
Plugins are the central feature that allows for the extension and customization of the build process.
Here are some commonly used Maven plugins:

1. Maven Compiler Plugin: Used during the compile phase. It compiles the source code of a Maven project.

2. Maven Surefire Plugin: Often used during the test phase. It is used to run unit tests of an application. It generates reports in various formats and can fail the build if a test fails.

3. Maven Failsafe Plugin: Integrated during the integration-test and verify phases. It is designed to run integration tests while allowing the build to continue even if some of them fail.

# 13. In Repo/MavenProject directory, create a maven Module using Intellij, named it as belows:
1.  groupID: com.chuwa.learn

2.  artifactID: java-core \
Please check the directory Repo/MavenProject