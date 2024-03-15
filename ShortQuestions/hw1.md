# Homework 1

#### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md

[README.md](hw1/README.md)

#### 2. practice git using the platform. list the git commands you learned

```
git commit
git checkout -b <branch_name>
git branch
git merge
git rebase
git log
git reset
git revert
git cherry-pick
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
git clone https://github.com/...
```

#### 5. How to create a new branch and checkout to that branch?

```
git checkout -b <new_branch>
```

#### 6. How to merge the branch_test to master branch in command? show me the commands

```
git checkout master
git merge branch_test
```

#### 7. How to **stash** your new code before leaving branch **branch_learn_stash** and pop your stash when you checkout back to branch_learn_stash? try commands way and intellij way.

```
git checkout branch_learn_stash
git stash
git checkout branch_learn_stash
git stash pop
```

1. Go to `VCS` -> `Git` -> `Stash Changes...` to stash changes.
2. Switch branches as needed.
3. When return to `branch_learn_stash`, go to `VCS` -> `Git` -> `Unstash Changes...` to apply stashed changes.

#### 8. How do you understand PR is based on Branch?

A pull request is a method to merge changes from one branch into another (usually the main or master branch) after peer review and approval. It's based on branches to isolate changes, facilitate review, and ensure safe integration of new code into the existing codebase.

#### 9. What is maven role? what it be used to do?

Maven is a build automation tool used primarily for Java projects. It is capable of:

1. **Project Building**: Maven compiles source code, packages the compiled code into JAR or WAR files, and deploys these artifacts to a local or remote repository.
2. **Dependency Management**: It automatically downloads the necessary libraries and plugins required for the project from the central Maven repository or other configured repositories. Maven also handles transitive dependencies (dependencies of dependencies).
3. **Project Standardization**: Maven uses a standard directory layout and a default build lifecycle which helps in standardizing the build process for all projects using Maven.
4. **Project Information Management**: Maven can generate a website or documentation for the project, including reports on code quality, test results, dependencies, and team information.
5. **Build Profiles**: Maven supports different build environments (development, test, production) through the use of build profiles.

#### 10. What is the **lifecycle** of maven? could you tell me the details ?

The Maven lifecycle is a defined sequence of phases during the build process, which provides a framework for managing the lifecycle of a project.

1. **validate**: Checks if all information necessary for the build is available and valid.
2. **compile**: Compiles the source code of the project.
3. **test**: Tests the compiled source code using a suitable unit testing framework. 
4. **package**: Packages the compiled code into its distributable format, such as a JAR or WAR file.
5. **verify**: Runs any checks to validate the package is valid and meets quality criteria.
6. **install**: Installs the package into the local repository.
7. **deploy**: Copies the final package to the remote repository for sharing with other developers and projects.

#### 11. what is the difference between **package** and **install** in maven lifecycle ?

`package` is about creating the distributable artifact (like a JAR file), whereas `install` is about placing that artifact into local repository to make it easily reusable across different projects without needing to reference a specific build directory.

#### 12. What is **plugins** in maven, list some plugins.

In Maven, plugins are tools that provide specific goals to fulfill various build requirements. 

1. **`maven-compiler-plugin`**: Compiles Java source code. 
2. **`maven-surefire-plugin`**: Used during the `test` phase of the Maven lifecycle to execute unit tests. 
3. **`maven-jar-plugin`**: Builds a JAR file from the project during the `package` phase. It compiles and packages the Java project.
4. **`maven-war-plugin`**: Used for web applications to compile and package the project into a WAR file during the `package` phase.
5. **`maven-clean-plugin`**: Used in the `clean` phase to remove the files generated at build-time in the `target` directory.
6. **`maven-install-plugin`**: Installs the package into the local repository.
7. **`maven-deploy-plugin`**: Used in the `deploy` phase to copy the final package to the remote repository for sharing with other developers and projects.
8. **`maven-site-plugin`**: Generates a site for the project that includes any documentation or reports.

#### 13. In **Repo/MavenProject** directory, create a **maven Module** using Intellij, named it as belows:

1. groupID:**com.chuwa.learn**
2. artifactID:**java-core**

#### 14. Do **Code Review**: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please **don't** merge it.