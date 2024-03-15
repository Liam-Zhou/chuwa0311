1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax

   - Please refer to README.md
  
2.  practice git using the platform. list the git commands you learned
   - 1.  https://learngitbranching.js.org/
   - 2.  git commit
  3.  git checkout -b fixBug
  4.  $ git checkout -b bugFix
  5.  $ git rebase main
  6.  $ git merge bugFix
  7.  git checkout C4 > checkout head
  8.  git checkout HEAD^
  9.  git reset
  10. git revert
  11. git cherry-pick
  12. git tag
3.  What is the basic steps to init a git repo in you local ?
    - go to your target directory and type
    - git init
4.  How to clone a repo from Github ?
    - git clone "url that you want to clone"
5.  How to create a new branch and checkout to that branch ?
    - git checkout -b "new branch name"
6.  How to merge the branch_test to master branch in command ? show me the commands
    - git checkout master
    - git merge branch_test
7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
    - git stash
    - git checkout mster
    - git stash pop
    - git checkout branch_learn_stash
8.  How do you understand PR is based on Branch?
    - Since for each PR, we have a source branch and a target branch, to create a PR, we would merge a source branch to the target branch
12.  What is maven role ? what it be used to do ?
    - maven
14.  What is the lifecycle of maven? could you tell me the details ?
15.  what is the difference between package and install in maven lifecycle ?
16.  What is plugins in maven, list some plugins.
17.  In Repo/MavenProject directory, create a maven Module using Intellij, named it as belows:
- 1.  groupID: com.chuwa.learn 
- 2.  artifactID: java-core 
14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.

