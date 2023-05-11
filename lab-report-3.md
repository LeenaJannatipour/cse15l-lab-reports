# Lab Report 3
## Researching grep command:
### Alternate ways to use grep + grep options:
#### Common Grep Use
grep will search a file for the given string, and print matching lines:
grep <<string>> <<files>>
```
grep "hello" ./technical
```
1. grep -c
  - this will output the count of lines that match <<string>> in one or more files
  - this will not display the lines that are matched, only a single number for the number of occurrences
```
  [cs15lsp23kd@ieng6-201]:stringsearch-data:119$ grep -c "e" technical/plos/pmed.0020281.txt
  32
```
```
  [cs15lsp23kd@ieng6-201]:stringsearch-data:122$ grep -c "a" technical/government/Media/water_fees.txt
  54
```
2. grep -R
  - this command will search through all the files in that directory and print the file its in and the matching output
  - this is particularly helpful when you need to look across a directory for a string pattern 
```
[cs15lsp23kd@ieng6-201]:stringsearch-data:128$ grep -R "Z" technical/government/Alcohol_Problems
technical/government/Alcohol_Problems/Session2-PDF.txt:16. Isaacson J, Butler R, Zacharek M, Tzelepis A. A screening
technical/government/Alcohol_Problems/Session3-PDF.txt:problem drinking that measured injury outcomes, Dinh-Zarr and
technical/government/Alcohol_Problems/Session3-PDF.txt:Zuska, a surgeon with an interest in alcohol problems among injured
technical/government/Alcohol_Problems/Session3-PDF.txt:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
technical/government/Alcohol_Problems/Session3-PDF.txt:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
technical/government/Alcohol_Problems/Session3-PDF.txt:31. Dinh-Zarr T, Diguiseppi C, Heitman E, Roberts I. Preventing
technical/government/Alcohol_Problems/Session3-PDF.txt:50. Zimmerman GL, Olsen CG, Bosworth MF. A "stages of change"
technical/government/Alcohol_Problems/Session3-PDF.txt:52. Zuska JJ. Wounds without cause. Bull Am Coll Surg
technical/government/Alcohol_Problems/Session3-PDF.txt:6. Zink BJ, Maio RF. Alcohol use and trauma. Acad Emerg Med
technical/government/Alcohol_Problems/Session3-PDF.txt:16. Dinh-Zarr T, Diguiseppi C, Heitman E, Roberts I. Preventing
technical/government/Alcohol_Problems/Session3-PDF.txt:believed studies from England and New Zealand should be viewed very
technical/government/Alcohol_Problems/Session4-PDF.txt:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
technical/government/Alcohol_Problems/Session4-PDF.txt:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
technical/government/Alcohol_Problems/Session4-PDF.txt:PA, Craig SA, Zink BJ. Patients with alcohol problems in the
```
```
[cs15lsp23kd@ieng6-201]:stringsearch-data:130$ grep -R "tired" technical/biomed
technical/biomed/1471-2458-2-25.txt:              tired of being sick and tired and I knew I could be a
technical/biomed/1471-2458-2-25.txt:              better parent to my children and I just was tired. I
technical/biomed/1472-6793-3-5.txt:          C57Bl/6J retired breeders also obtained from The Jackson
technical/biomed/1472-6815-2-3.txt:          nervous? Does your tinnitus make you feel tired or
technical/biomed/ar624.txt:          young retired breeders, were purchased from the National
technical/biomed/gb-2001-2-9-research0035.txt:          retired: bo322, bo395, bo663, bo667, bo669 and bo671 (G.
technical/biomed/gb-2001-2-9-research0035.txt:          candidate CDSs include retired Bnums (six Magnums), CDSs
```
3. grep -i
  - will be case insensitive in the search (upper and lower case letters)
  ```
  [cs15lsp23kd@ieng6-201]:stringsearch-data:135$ grep -i "hello" technical/911report/chapter-1.txt
    At 10:39, the Vice President updated the Secretary on the air threat conference: Vice President: There's been at least three instances here where we've had reports of aircraft approaching Washington-a couple were confirmed hijack. And, pursuant to the President's instructions I gave authorization for them to be taken out. Hello?
  ```
  ```
  [cs15lsp23kd@ieng6-201]:stringsearch-data:147$ grep -i "Analyze" technical/911report/chapter-6.txt
            In late 1999, the National Security Agency (NSA) analyzed communications associated
  ```
4. grep -v
  - this command will list all lines without the given string 
  - it is the inverse of grep
  - this command will leave spaces where the pattern is a match in the file you are using grep in (as seen below)
  ```
  [cs15lsp23kd@ieng6-201]:stringsearch-data:154$ grep -v "a" technical/government/Media/Survey.txt






12-09-2002
Among the findings:


•
money for tuition.


•


•


•


•


$25,000.
worse."
expertise."


CITY BAR REPORT
months.
problem."
meeting next spring.
"This is within our vision, but I doubt if we could do it this
centers."





  ```
  ```
  [cs15lsp23kd@ieng6-201]:stringsearch-data:159$ grep -v -i "a" technical/government/Media/Terrorist_Attack.txt




System
Center.
buildings."

profession.
Project.
perform.


The Slowly Grinding Wheels of Justice
will work."
philosophy.




  ```
  
  **All sources by https://www.cyberciti.biz/faq/howto-use-grep-command-in-linux-unix/** 
  
