# ShortQuestions
> More on How to Write MarkDown File: [Basic writing and formatting syntax](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
>
> [Git Commands Learning](https://learngitbranching.js.org)
>
> More on Using Emoji : [Emoji CheatSheet](https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md) :butterfly:
## Submit Homework Pocess

**_Step 1 Get Updates From Remote Repo_**

- checkout personal master branch
```bash
git checkout Becky_Song/master
```
- pull remote changes to master branch
```bash
git pull origin
```
**_Step 2 Create hw Subbranch and make changes_**
- create sub branch
```bash
git checkout -b Becky_Song/hw[x]
```
**_Step 3 Make PR_**
- add all changes
```bash
git add .
```
- commit changes
```bash
git commit -m "messages"
```
- push to origin to raise a PR on github
```bash
git push origin Becky_Song/hw[x] 
```
- open github create PR, wait for review, then merge the hw branch to master branch.

## Homework List

1. Week 1
    - [x] [HW 1 Maven; Git; PR](hw1.md)
    - [x] [HW 2 Java OOP](hw2.md)