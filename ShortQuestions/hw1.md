# **Homework 1**
### _Zan Zhang_
### _Mar 15th 2024_

1. Done
2.  - Creating branches (git branch), switching between branches (git checkout), and committing changes (git commit)
    - Merging branches (git merge) is essential for integrating changes from one branch into another. 
    - Rebasing (git rebase) is an alternative to merging that allows for a cleaner commit history.
    - Detached HEAD State
3. - Navigate to the directory where you want to initialize the git repository
   - Initialize a new Git repository: **_git init_** 
   - Write some code or create files: **_touch README.md_**
   - Add the files to the staging area: **_git add README.md_**
   - Commit: **_git commit -m "My commit: Added README.md"_**
   - Add and commit any additional changes: **_git add ._**, **_git commit -m "second"_**
4.  **_git clone repository_url_**
5. - **_git branch my_branch_**
   - **_git checkout my_branch_**
6. - **_checkout master_**
   - **_git pull origin master_**
   - **_git merge branch_test_**
   - For any merge conflicts: After resolve these conflicts manually,add the resolved files (git add) and then (git commit).
   - **_git push origin master_**
7. **_How to stash your new code before leaving branch "branch_learn_stash" and copy your stash when you checkout back to "branch_learn_stash" ? try commands way and intellij way?_**
   
     - **_git stash_** //save temporarily in a "stash"
     - **_git branch my_branch_**
     - **_git checkout branch_learn_stash_**
     - **_git stash apply_** //apply the most recent stash to working directory
   - **Using IntelliJ IDEA:**
     - open Git -> Uncommitted Changes -> stash changes
     - switch to another branch Git -> Branches -> choose it
     - work on the other branch as needed
     - switch back to branch_learn_stash
     - Apply the stashed changes: log -> Right-click on the stash entry that contains your changes and select "Apply Stash".
8. **_How do you understand Pull and Request is based on Branch?_**
- **Pull and Request are base on branches because we propose changes from a branch to main branch within a git repository**
  - Isolation of Changes: Branches provide isolation for separate lines of development.
  - Collaboration: Pull requests facilitate collaboration and code review.
  - Code Review: Pull requests allow for thorough code review before merging.
  - Integration Testing: Pull requests enable integration testing of proposed changes.
  - Traceability and History: Pull requests serve as a record of proposed changes and discussions.
9. **_What is maven role?what it be used to do?_**
  - is an auto building tool used for Java project. It provides a way to manage project dependencies, build processes, and project lifecycle management.
  - organizes the project’s structure --> tracks dependencies --> handles the build process
10. **_Life cycle of maven?_**
    default Lifecycle consists 8 Phases: Validate, Compile, Test, Package, Integration Test, Verify, Install, and Deploy.
    - Validate: validate the project is correct and all necessary information is available
    - Compile: Compiles the source code
    - Test: Runs unit tests
    - Package: Creates a distributable artifact(a Jar that gets deployed to a maven repository)
    - Verify: Additional checks on the packaged artifacts to ensure their correctness and integrity
    - Install: Installs the packaged artifacts into the local Maven repository (~/.m2/repository). This phase makes the artifacts available for use by other projects on the local machine.
    - Deploy: Copies the packaged artifacts to a remote repository.
11. **_what is the difference between package and install in maven lifecycle?_**
    - **package** will compile your code and also package it. For example, if your pom says the project is a jar, it will create a jar for you when you package it and put it somewhere in the target directory (by default).
    - **install** will compile and package, but it will also put the package in your local repository. This will make it so other projects can refer to it and grab it from your local repository.
12. **_What is plugins in maven, list some plugins?_**
    - Build – executed during the build process. Examples include Clean, Install, and Surefire plugins. These should be configured in the build section of the POM.
    - Reporting – executed during site generation to produce various project reports. Examples include Javadoc and Checkstyle plugins.
13. Done
14. Done