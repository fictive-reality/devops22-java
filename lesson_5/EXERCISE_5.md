# Exercise 5

## Instructions

This exercise is a continuation of the `Group Exercise` from lesson 4. You will now start implementing some of your ideas. But the focus of this group project is NOT to complete as many features as possible, it's to do as good testing as possible. In fact, you can write most tests without having any completed feature code at all.


## `Mini project` Test Driven development

In this mini project you should continue with the same team as in lesson 4. 

1. One person in your team should start a new repository on GitHub and invite the others as collaborators / members. Also invite me as collaborator.
2. Create a NAMES.md file with all team members GitHub username, and their first and last name.
3. Create a DESIGN.md file. Write or copy some bullet points from Lesson 4 that describes the desired features, including nouns and verbs used. Also add the diagram as an image or similar. You may change or improve on the design but don't spend more than 1 hour on this.
4. Setup the project using Maven. See detailed instructions below.
5. Now you can split up and start writing classes, dummy methods and tests. You can pick the best code that you wrote individually in Lesson 4, or you could start fresh.

### Requirements

* At least three classes
* One test file per class file
* At least a total of 20 test cases and none of them failing
* I expect everyone to commit code in this project and I may check commit history, so make sure you either commit individually OR that you write in the commit message if someone else was helping to write that commit.

The focus of this exercise is NOT to write a complete and functioning app, it's to practice testing! So start with writing classes and good tests, then as time allows follow the Test-Driven Design loop to step-by-step make the app more functional. It is fully expected that the submitted code still contains dummy methods or is missing functionality from the original design. The important part is that the tests work, covers the expected behaviour from the design and that they are varied and useful.

If the classes from your app idea doesn't seem to have enough things to test, just come up with additional design requirements (features) that would imply more testable methods.

### Good tests

There's lots of info in LINKS and online about writing good tests, but here are a few tips:

- Always start with a good design on what SHOULD and SHOULDN'T happen, and write the test based on that
- If you are testing inherited classes, you don't always need to write the same tests for both the parent and the child class if the method hasn't changed!
- Make sure to not only test that the method works as intended, but also how it should handle bad arguments, incorrect data or that it's in the wrong state (not initialized, not saved, etc).
- Try to vary the tests and think creatively what could go wrong in real life.
- Write more tests on methods that you expect to be more complicated, and fewer or no tests on very simple methods, such as getters.
- As you write the tests, you may want to change (refactor) the dummy methods to be easier to test, that's a good side effect of testing. For example, it's typical you want to split up a method to easier test parts of it, or add arguments to cover more variations.

### Extra Extensions [Optional]

If you have time left you can try out some extras, see LINKS.md for more info.

* Use "hamcrest matchers" for more readable and flexible tests.
* Add a coverage plugin to maven, check the links file for JaCoCo. Properly configured it will add a check that your project has good enough coverage, it will also generate a site report in html where you can browse your coverage.
* Try to write some mocks with Mockito.
* Complete the code in the body of dummy methods to make the app more feature complete

### Setting up the project with Maven

```bash
# Make sure maven works, should be installed since lesson 5
mvn --version

# Clone the repository if it was created first on GitHub
# Make sure to clone it outside the `devops22-java` folder to avoid conflict
# Replace all elements inside <brackets> below with the real names you chose
cd <your/source/path/somewhere>
git clone git@github.com:<myuser>/<myrepo>.git

# This command will create a new folder, named by the artifactId
# IMPORTANT, don't go into the <myrepo> directory, run this outside, and make sure DartifactId is the exact same as the folder name
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false -DgroupId=se.nackademin -DartifactId=<myrepo> 

# You should get a generated java project
cd <into/the/repo>
mvn install
# it should print BUILD SUCCESS

# Then also try mvn test
mvn test 

# it should print BUILD SUCCESS, some metrics and further up you should see [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

Note that you can also check Maven from inside VS Code in the Maven pane in the Explorer tab, and in the Testing tab you can also run the tests. So you don't need to use `mvn` on the command line.


## Hand in instructions

This is a group exercise so make sure that all members of the team has committed something to the code.

* [ ] Ensure you have a NAMES.md file that contains the full name of all team members.
* [ ] Invite me as collaborator to the repository
* [ ] Recommended method of handing in: when you are done on e.g. branch `main`, create a separate branch `submission` and make a pull request from main to submission. Then set me as Reviewer. In this way it's easy for me to comment on your submission. If this doesn't work, you can also email me when you are done.