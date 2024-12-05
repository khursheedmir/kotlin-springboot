Write comprehensive and high-quality unit test cases for the given class, considering the following key aspects. Use modern industry-standard best practices and ensure tests are readable, maintainable, and reusable.

Functional Testing:

Write positive test cases covering various valid input scenarios for all methods.
Write negative test cases for invalid input values (e.g., null, empty strings, unsupported types, or out-of-range numbers).
Validate behavior under typical and edge-case scenarios.
Boundary Value Testing:

Test inputs at the boundaries of valid ranges (e.g., min/max values for numbers, empty/non-empty collections).
Include edge cases like zero, empty strings, and large numbers to ensure robustness.
Error Handling Testing:

Validate error handling for invalid inputs, unexpected states, and exceptions.
Ensure proper exceptions are thrown with meaningful error messages.
Performance Testing:

Measure execution time for computationally intensive methods with large datasets or complex inputs.
Ensure performance remains within acceptable thresholds.
Security Testing (if applicable):

Verify against common vulnerabilities such as SQL injection, XSS, or buffer overflows (specific to web-related or database-interacting methods).
Mocking and Stubbing:

Mock dependencies for isolated testing of the class methods.
Use appropriate test doubles for external API calls, database interactions, or third-party integrations.
Test Case Description:

Provide clear, concise descriptions for each test case, detailing the purpose, inputs, expected outputs, and any special conditions.
Coding Standards:

Follow naming conventions like should<Behavior> or test<Method> for test methods.
Structure tests with Arrange-Act-Assert (AAA) or Given-When-Then (GWT) format for clarity.
Framework-Specific Guidelines:

For Java, use JUnit or TestNG, adhering to proper annotations and lifecycle methods.
For Python, use unittest or pytest with fixtures and parameterized tests.
For TypeScript, use Jest or Mocha/Chai for robust testing.
For React.js, use Jest and React Testing Library, ensuring proper coverage for both unit and integration tests.
Code Coverage:

Aim for 100% coverage, including branches and conditions, to ensure the class is thoroughly tested.
=====================================================================================================


Write comprehensive unit test cases for the [ClassName] class, adhering to the following guidelines:
Test Structure
Follow the Arrange-Act-Assert (AAA) pattern for each test.
Use descriptive, action-oriented names for test methods (e.g., shouldReturnSumWhenAddingTwoPositiveNumbers()).
Keep tests short, focused, and easy to read.
Use the appropriate testing framework:
Java: JUnit
Python: pytest
TypeScript: Jest
React: Jest with React Testing Library
Test Coverage
Functional Testing:
Write positive test cases for all public methods with various valid input combinations.
Include negative test cases with invalid inputs (null, undefined, empty strings, out-of-range values).
Test edge cases (minimum/maximum values, empty collections, single-element collections).
Boundary Value Testing:
Test input values at and around the boundaries of valid ranges.
Error Handling:
Verify appropriate exceptions are thrown for invalid inputs or unexpected conditions.
Test exception messages and types.
State Testing:
Verify object state changes after method calls, if applicable.
Integration Testing (for React components):
Test component rendering and interactions.
Verify proper prop passing and state management.
Best Practices
Ensure tests are independent and can run in any order.
Use setup and teardown methods to initialize common test fixtures and clean up resources.
Mock external dependencies to isolate the unit under test.
Use parameterized tests for testing multiple input combinations.
Aim for high code coverage, but prioritize meaningful tests over 100% coverage.
Write tests for bug fixes to prevent regressions.
Assertions
Use precise assertions that clearly indicate the expected outcome.
Prefer equality assertions over boolean assertions where applicable.
For floating-point comparisons, use appropriate delta values.
Performance Considerations
Keep tests fast-running (milliseconds per test).
For performance-critical methods, use appropriate annotations or utilities to measure execution time.
Documentation
Provide a brief description of each test case's purpose using comments.
Document any non-obvious test setup or assertions.
Security Considerations (if applicable)
Include tests for input validation and sanitization.
Test for potential security vulnerabilities relevant to the class functionality.
Remember to make your tests repeatable, isolated, and deterministic. Avoid logic in tests and focus on testing one scenario per test method. Ensure your test suite runs quickly to encourage frequent execution.
For React components, include additional tests for:
Rendering of components with different props
User interactions (clicks, input changes, etc.)
State updates and re-renders
Integration with hooks and context
Provide clear instructions on how to run the tests and any necessary setup steps.

====================================================================================

Example:
Write tests for a Calculator class with methods like add, subtract, multiply, and divide, ensuring all of the above aspects are covered.

Output the tests in the specified programming language, formatted for the respective testing framework, with detailed comments explaining each test case.

===================================================================================================


Ultimate Unit Testing Prompt:
Write comprehensive, high-quality, and maintainable unit test cases for the [ClassName] class using the specified programming language and testing framework. Adhere to the following best practices:

1. Test Coverage
Functional Testing:

Write positive test cases covering all public methods with valid input combinations.
Include negative test cases for invalid inputs (e.g., null, undefined, empty strings, unsupported types, or out-of-range values).
Test behavior for typical, edge, and special cases.
Boundary Value Testing:

Validate inputs at and near the boundaries of valid ranges (e.g., min/max values, empty/non-empty collections, zero values, and large inputs).
Error Handling:

Ensure proper exceptions are thrown with meaningful error messages for invalid inputs and unexpected conditions.
Validate exception types and messages.
State Testing (if applicable):

Test object state changes after method invocations.
Integration Testing (if applicable for React components):

Verify rendering and interaction of components.
Validate prop passing, state updates, and integration with hooks or context.
2. Test Implementation
Test Structure:

Follow the Arrange-Act-Assert (AAA) or Given-When-Then (GWT) pattern for clarity.
Use descriptive, action-oriented method names (e.g., shouldReturnSumForValidInputs()).
Keep tests short, isolated, and focused.
Framework-Specific Guidance:

For Java, use JUnit or TestNG with appropriate annotations and lifecycle methods.
For Python, use pytest or unittest, leveraging fixtures and parameterized tests.
For TypeScript, use Jest or Mocha/Chai for unit testing.
For React.js, use Jest and React Testing Library for component and integration tests.
Mocking and Stubbing:

Use mocks/stubs for external dependencies (e.g., APIs, databases).
Focus on testing the unit in isolation.
3. Best Practices
Ensure tests are independent and can run in any order.
Use setup and teardown methods for reusable test fixtures.
Leverage parameterized tests for multiple input combinations.
Write regression tests for bug fixes to prevent future issues.
4. Assertions
Use precise assertions that clearly express the expected outcome.
For floating-point operations, include a tolerance (delta) for comparisons.
Validate returned values, state changes, and method calls on mocked dependencies.
5. Performance and Security
Performance Testing:

Measure execution time for performance-critical methods with large or complex inputs.
Ensure performance remains within acceptable thresholds.
Security Testing:

Validate against vulnerabilities like SQL injection, XSS, and buffer overflows.
Test input validation and sanitization for web or database-related methods.
6. Documentation
Provide clear and concise comments for each test case, describing the test purpose, inputs, and expected outputs.
Document any specific setup or unusual conditions.
7. Code Coverage
Aim for 100% code coverage with meaningful tests for branches and conditions.
Prioritize quality over quantity—focus on real-world scenarios over artificial cases.
Example Request:
Write test cases for a Calculator class with methods like add, subtract, multiply, and divide, ensuring all aspects above are covered. Include detailed comments explaining each test case.

Output the test cases in the specified programming language using the chosen testing framework. Ensure the tests are readable, reusable, and adhere to best practices.

===============================================================================================================

Create a TypeScript React application for a shopping cart system. The application should:
Display a list of products fetched from a JSON file
Allow users to add and remove items from the cart
Implement a cart context using React's Context API
Use a custom hook to manage cart state and local storage
Include a header component showing the total items and price
Create a footer component with a view cart option
Style the application using a UI library like Chakra UI
