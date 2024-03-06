# Useful git commands

```
git add .
```
_Track all untracked files_

```
git add filename
```
_Track selected files_

```
git checkout branch_name
```
_Switch to another branch_

```
git checkout -b branch_name
```
_Create a new branch_

```
git commit -m "name"
```
_Commit changes, specifying the commit name in a single line_

```
git commit
```
_Commit changes, edit commit message in a text editor of your choice_

```
git log
```
_List the full message of each commit with additional information, such as hash, author or date_

```
git log --oneline
```
_List the first line of each commit with the corresponding ID_

```
git push
```
_Update the remote branch with local commits_

```
git rebase -i first_commit_hash
```
_Lets you perform various operations on commits, including reordering, dropping and squashing_

```
git revert commit_id
```
_Revert a specified commit_

```
git stash
```
_Stashes changes, thus making the working directory clean. Useful when switching to another branch_

```
git stash list
```
_Provides a summary of the stashed changes_

```
git stash show
```
_Displays the details of a stashed commit_

```
git stash drop
```
_Removes the top / a specified stash_

```
git status
```
_Display the working tree status_
