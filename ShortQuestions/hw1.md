1. Learn **MarkDown** and show all of basic usage in the **ShortQuestions/README.md**

2. Practice git using the [platform](https://learngitbranching.js.org/). List the git commands you learned

   ```
   git init
   git status
   git add <file|folder>
   git commit -m "message" <--amend>
   git log --all --graph
   git reset
   git branch <branch_name>
   git branch -D <branch_name>
   git checkout <branch_name>
   git remote -v
   git push <remote_name> <branch>
   git clone
   git fetch
   git pull
   ```

3. What is the basic steps to init a git repo in your local?

   ```
   cd repo_dir
   git init
   // make changes...
   git add .
   git commit -m "initial commit"
   ```

4. How to clone a repo from Github?

   1. Go to Github repo, click the green **Code** button

   2. Copy HTTPS or SSH url

   3. In terminal cd to repo folder in local and run command
      ```
      git clone <repo_url>
      ```

5. How to create a new branch and checkout to that branch?

   ```
   git branch new_branch_name
   git checkout new_branch_name
   ```

6. How to merge the branch_test to master branch in command?
   ```
   git checkout master
   git fetch
   git merge branch_test -m "message"
   ```

7. How to stash your new code before leaving branch **branch_learn_stash** and pop your stash when you checkout back to **branch_learn_stash**?

   ```
   git stash
   git checkout branch_name
   git checkout branch_learn_stash
   git stash pop
   ```

8. How do you understand **PR is based on Branch**?

   A  raised PR means you have finished developing your features and ready for a code review by peers or seniors. You would develop your features in your branch because you do not want to mess up with production code (master branch). Once your PR is raised, reviewed and approved, your branch will be merged into master branch.

9. What is **maven** role? What it be used to do?

   Maven is a **build automation tool** primarily used for Java projects. Its role is to **manage project dependencies**, **build processes**, and **project documentation**. Maven uses a project object model (POM) to describe the project's structure and its dependencies.

10. What is the **lifecycle** of maven?

    The lifecycle of maven represents sequential phases of Java project build.

​	clean, validate, compile, test, package, verify, install, deploy

11. What is the difference between **package** and **install** in maven lifecycle?

    Package: take compiled code and create the JAR/WAR package as mentioned in the packaging in POM.xml

    Install: install the package in local/remote maven repository so that the dependency is available for other projects

12. What is plugins in maven. List some plugins.

    Plugins can extend Maven's functionality to execute various tasks during the build process. For example, Compiler Plugin compiles Java source code. Javadoc Plugin generates API documentation in HTML format. Deploy Plugin deploys artifacts to remote repositories.