For test code coverage, read up on jacoco in LINKS and then install it into your project using Maven.

Recommended that you install the Coverage Gutter add-in for VS Code to show visually which lines have been tested or not.

Once Jacoco is installed, every time you run `mvn test` it will also produce a file `target/jacoco.exec`. To show it in a readable format, run `mvn jacoco:report` to produce an HTML report in `target/site/jacoco/index.html`. This will also make Coverage Gutter work, as long you have clicked the "Watch" word in the bottom left status bar and if you are looking at a .java file in VS Code which has been tested.

Every time you change code or tests you would need to re-run mvn test and mvn jacoco:report. You can always double check on the jacoco HTML report under Sessions when the test was run that the report is based on.