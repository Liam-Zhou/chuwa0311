#Home Work 1

**1.  Learn MarkDown and show all of basic usage in the ShortQuestions/README.md**

**2.  practice git using the platform. list the git commands you learned**

```bash
git init
git status
git add .
git commit -m ""
git push 
git pull
git merge
```

**3.  What is the basic steps to init a git repo in you local ?**
```bash
git init
```
**4.  How to clone a repo from Github ?**
```bash
git clone github_url
```
**5.  How to create a new branch and checkout to that branch ?**
```bash
git checkout -b <branch_name>
```
**6.  How to merge the branch_test to master branch in command ? show me the commands**
```bash
git checkout master
git merge branch_test
```
**7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.**
```bash
git stash
git stash pop
```
**8.  How do you understand PR is based on Branch?**

When a pull request (PR) is based on a branch, it means that someone has made changes to a separate branch of the project's code. Instead of making these changes directly to the main code, they've worked on their own branch. The PR is like a suggestion to add these changes from their branch into the main code.

So I think this setup allows team members to review the proposed changes and make sure they're good before adding them to the main codebase. It's a way to keep everything organized and make sure new changes don't break anything.

**9.  What is maven role ? what it be used to do ?**

Maven is a build automation tool primarily used for Java projects. Its role is to streamline and manage the project's build process, including compiling source code, managing dependencies, running tests, packaging the application into distributable formats, and generating documentation. Maven simplifies Java project management and ensures a standardized approach to building and deploying software.

**10.  What is the lifecycle of maven? could you tell me the details ?**

The Maven lifecycle consists of three main phases: clean, default, and site.
- The "clean" phase removes any previous build output. 

- The "default" phase handles compilation, testing, packaging, and deployment. 

- The "site" phase generates project documentation.

Each phase contains a series of predefined goals that execute specific tasks, providing a standardized and structured approach to project builds.

**11.  what is the difference between package and install in maven lifecycle ?**

In the Maven lifecycle, the "package" phase creates a distributable artifact (e.g., JAR, WAR) of your project, while the "install" phase copies that artifact into your local Maven repository. Essentially, "package" creates the artifact locally, while "install" makes it available for use in other projects on your machine.

**12.  What is plugins in maven, list some plugins.**

In Maven, plugins are extensions that provide additional functionality to the build process. They perform tasks like compiling code, running tests, generating documentation, and deploying artifacts.
- `maven-compiler-plugin`: Compiles Java source code.
- `maven-surefire-plugin`: Runs unit tests.
- `maven-jar-plugin`: Creates JAR files.
- `maven-war-plugin`: Packages web applications into WAR files.
- `maven-javadoc-plugin`: Generates Java API documentation.

Plugins are configured in the `pom.xml` file and executed during different phases of the build lifecycle. They allow developers to customize and extend the build process according to project requirements.