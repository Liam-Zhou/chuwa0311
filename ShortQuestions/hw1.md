## Home Work 1

1. **Learn MarkDown and show all of basic usage in the ShortQuestions/README.md**
2. **List the git commands you learned**
    ```
    git commit
    git add
    git status
    git push
    git fetch
    git branch
    git pull
    git merge
    git rebase
    git clone
    ```
3. **What is the basic steps to init a git repo in you local ?**
    1. Navigate to the Project Directory: we can make a new directory using mkdir project_name and then navigate into it with `cd project_name`.
    2. Initialize the Git Repository: we can run the following command: `git init`.
4. **How to clone a repo from Github ?**
   1. Copy the Repository URL from github
   2. Navigate to the directory where we want the cloned directory to be added.
   3. Clone the repo: we can run the command `git clone <repository_url>`.
5. **How to create a new branch and checkout to that branch ?**
   ```
   git checkout -b <new_branch> 
   ```
6. **How to merge the branch_test to master branch in command ? show me the commands**
   1. Switch to the Master Branch: `git checkout master`.
   2. Pull Latest Changes: `git pull origin master`.
   3. Merge branch_test into master: `git merge branch_test`.
7. **How to stash your new code before leaving branch 'branch_learn_stash' and pop your stash when you checkout back to 'branch_learn_stash' ? try commands way and intellij way.**
   1. Stash your changes in branch_learn_stash: `git stash`
   2. Switch to the new branch: `git checkout branch_learn_stash`
   3. Switch to the original branch and pop the stash: `git stash pop`
8. **How do you understand PR is based on Branch?**
   - When a developer wants to add a new feature, they create a new branch from the main codebase and make their changes there. Once the work is complete, they submit a PR. This PR is a request to merge their branch's changes into the main branch. It allows team members to review the proposed changes, and integrate them into the main project.
   - Branches is an important part of managing and integrating different lines of development within a project. 
9.  **What is maven role ? what it be used to do ?**
    1. Maven is a powerful project management tool that is used primarily for Java projects. Maven automates the process of building software. Maven can also manage project dependencies.
    2. Maven is used to improve project management. Its use is not limited to Java projects alone; Maven can also be used for projects in other programming languages.
10. **What is the lifecycle of maven? could you tell me the details ?**
    - validate: Validates the project is correct.
    - compile: Compiles the source code of the project.
    - test: Tests the compiled source code using a suitable unit testing framework.
    - package: Packages the compiled code in its distributable format, such as a JAR.
    - verify: Runs any checks to verify the package is valid and meets quality criteria.
    - install: Installs the package into the local repository.
    - deploy: Copies the final package to the remote repository for sharing with other developers and projects.

11. **what is the difference between package and install in maven lifecycle ?**
  - Package phase: Compiling the project's code and resources, which remains within the local build directory. This artifact is not yet available for use as a dependency in other projects
  - Install phase: Installing the artifact into the local Maven repository on the machine, making it accessible to other projects as a dependency
  - Key difference: 
    1. scope (creating a distributable form vs. making the artifact available locally for reuse). 
    2. Location of artifacts (target directory vs. local repository), 
    3. Availability of artifacts for other projects (not directly usable vs. available as dependencies).
12. **What is plugins in maven, list some plugins.**
    
    In Maven, plugins are tools that provide additional tasks and extend the capabilities of Maven. Each plugin can execute a series of goals.
    - Maven Compiler Plugin : Compiles Java source code. 
    - Maven Install Plugin : Installs the project artifacts into the local Maven repository, making them available as dependencies for other projects. 
    - Maven Deploy Plugin : Used to upload the project's artifacts to a remote repository for sharing with other developers and projects. 
13. **In Repo/MavenProject directory, create a maven Module using Intellij, named it as belows:**
    
14. **Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other**
