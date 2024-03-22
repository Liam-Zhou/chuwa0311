##HW 1 Short Answer Questions
1. 
2. ### Practice git using the platform. list the git commands you learned
* git commit -m [commit text] - commit your staged content as a new commit snapshot
* git add [file] - add a file as it looks now to your next commit (stage)
* git branch [branch-name] - create a new branch at the current commit
* git checkout - switch to another branch and check it out into your working directory
* git init - initialize an existing directory as a Git repository
* git clone [url] - retrieve an entire repository from a hosted location via URL
* git push [alias] [branch] - Transmit local branch commits to the remote repository branch
* git pull - fetch and merge any commits from the tracking remote branch
* git rebase [branch] - apply any commits of current branch ahead of specified one
* git stash - Save modified and staged changes

3. ### What is the basic steps to init a repo in your local?**
```
* git init   at the desire directory
* git add.   to add all of the relevant files
* git commit  to commit
```
4. ### How to clone a repo from Github?**
```
* git clone [git repo url]
```
5. ### How to create a new branch and checkout to that branch?**
```
git checkout -b [branch name]
```
6. ### How to merge the branch_test to master branch in command?**
````
git checkout master
git merge -m "commit message" branch_test
````
7. ### How to stash your new code before leaving branch branch_learn_stash and pop your stash when you check our back to branch_learn_stash?**
````
git stash at branch branch_learn_stash
checkout otherbBranch
checkout branch_learn_stash
git stash pop
````
8. PR is based on branch because a PR refers to the branch you want to merge into main branch. After a PR is approved, the branch will automatically merged into the main branch and this branch can be delete after the  merge
9. Maven is build automation and project management tool for Java applications. It automates the source code compilation and dependency management and execute the test script
10. Three lifeCyles of Maven are: 
* Clean: clean phase ensures a clean and consistent build environment, it removes previous generated artifacts, and reducing the conflicts of outdated files
* Build: build phase automates the compilation, testing, and packaging processes. Maven's dependency management handles the resolution and integration of external libraries
* Site: site phase generates comprehensive project documentation, reports, and metrics.
11. * mvn package: creates JAR file for the project to convert it into a distributable format.
    * mvn install: deploys the packaged JAR file to the local repository
    
12. plugins are used to: create jar files, compile code, unit test code, create project documentation
Some examples of plugins are: pmd, linkcheck, project-info-reports.
13. See MavenProject directory
14. See PR


