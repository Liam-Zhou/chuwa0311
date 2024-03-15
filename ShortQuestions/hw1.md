

1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

   # A first-level heading
   ## A second-level heading
   ### A third-level heading

   **Bold**, *Italic*, ~~mistaken~~, **This text is _extremely_ important**, ***bold italic***,This is a <sub>subscript</sub> text, This is a <sup>superscript</sup> text

   Text that is not a quote

   > Text that is a quote

   ```
   code block
   ```

   `code line`

   [github chuawa page](https://github.com/Liam-Zhou/chuwa0311)

   images(with relative link) for below assignment

   - George Washington
     + nested list
     + nested list
   * John Adams

   + Thomas Jefferson

   - [ ] tasked list

   - [x] tasked list
   - [x] tasked list
   - [ ] Add delight to the experience when all tasks are complete  :tada:

   :happy: :clap: :+1: [the Emoji-Cheat-Sheet](https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md)

   

   Here is a simple footnote[^1].

   A footnote can also have multiple lines[^2].

   [^1]: My reference.
   [^2]: To add line breaks within a footnote, prefix new lines with 2 spaces.

   > [!NOTE]
   > Useful information that users should know, even when skimming content.

   > [!TIP]
   > Helpful advice for doing things better or more easily.

   > [!IMPORTANT]
   > Key information users need to know to achieve their goal.

   > [!WARNING]
   > Urgent info that needs immediate user attention to avoid problems.

   > [!CAUTION]
   > Advises about risks or negative outcomes of certain actions.

2. practice git using the platform. list the git commands you learned

   https://learngitbranching.js.org/

   ```bash
   git commit
   git checkout -b bugFix
   git branch bugFix
   
   git merge bugFix
   git rebase main
   git checkout [hashcode_commit]
   git checkout HEAD^
   git branch -f main HEAD~3
   
   git reset HEAD~1
   git revert HEAD
   
   git cherry-pick C2 C4 # for copying the commits
   git rebase -i main~4
   ```

3. What is the basic steps to init a git repo in you local ?

   $Ans.$ After downloading and installing **git**, excecute `git init` to initialize the git repository, and push to remote repo.

   ```bash
   git init
   git add .
   git commit -m "xxx"
   git push origin master/main
   ```

4. How to clone a repo from Github ?

   $Ans.$ Finding the `Code` *Button* in the repo, click the button and copy the link. And then `git clone [the link of the repo]`

   ```bash
   git clone https://github.com/Liam-Zhou/chuwa0311.git
   ```

5. How to create a new branch and checkout to that branch ?

   ```bash
   git checkout -b [new_branch]
   ```

6. How to merge the branch_test to master branch in command ? show me the commands

   ```bash
   git checkout master # Make sure I'm on the 'master' branch
   git merge branch_test # merge 'branch_test' into master
   ```

7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.

   ```bash
   git stash
   git checkout -b new_branch
   
   git checkout branch_learn_stash
   git stash pop
   ```

   intellij way：

   ![stash_with_intellij](.\screenshots\stash_with_intellij.png)

   



8. How do you understand PR is based on Branch?

   $Ans.$ PR is to deal with two branches but not files. After requesting the PR,  the supervisor will review the difference and updates of two branches, and update the target branch to a new version.

9. What is maven role ? what it be used to do ?

   $Ans. $ Maven is a tool to help user build project  and manage dependencies in an easy way. It has roles of managing packages, building project, producing JavaDoc, reporting and others.

10. What is the lifecycle of maven? could you tell me the details ?

    $Ans. $ With the command line `mvn [phase] [-options]`, the maven project will be built from the start phase (prepare-resources) to the target phase.

    For example, if I enter `mvn deploy`, I need to build the project from start to end.

    - prepare-resources - Resource copying can be customized in this phase.
    - validate - Validates if the project is correct and if all necessary information
      is available.
    - compile - Source code compilation is done in this phase.
    - Tests(be able to skip) - Tests the compiled source code suitable for testing framework.
    - package - This phase creates the JAR/WAR package as mentioned in the
      packaging in POM.xml.
    - install - This phase installs the package in local/remote maven
      repository.
    - Deploy - Copies the final package to the remote repository.

    Besides, there are clean life cycle and site life cycle. The previous one is before build period and  to delete the build directory. The latter one is after build life cycle and  to create documentation.

11. what is the difference between package and install in maven lifecycle ?

    $Ans.$ In the package phase, Maven gets compiled codes from compile phase and distributes compiled codes into pieces and formed files of JAR/WAR, which is the process of forming packages. However, these packages are just formed but not stored in our local disk.

    In the install phase, Maven will install the packages I mentioned above. Till now, these packages are truly in our local repository, and can be used by other projects.

12. What is plugins in maven, list some plugins.

    $Ans. $ Maven is actually a plugin execution framework where every task is actually done by plugins. Maven can only deal with specific tasks with plugins.

    Maven plugins:

    - clean
    - compiler
    - jar
    - javadoc
    - etc.

13. In Repo/MavenProject directory, create a maven Module using Intellij, named it as belows:

    groupID: com.chuwa.learn 

    artifactID: java-core 

    ![create_new_module](.\screenshots\create_new_module.png)

    

    ![mvn_pox_xml](.\screenshots\mvn_pox_xml.png)

14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.


