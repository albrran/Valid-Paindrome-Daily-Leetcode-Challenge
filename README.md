# Valid-Paindrome-Daily-Leetcode-Challenge
![1_OathM0PWiIfPfFuJ3wv87A](https://github.com/albrran/Valid-Anagram-Daily-Leetcode-Challenge/assets/120284166/4d831238-d99d-4762-93b5-6311438f469d)
<br>
<h2>A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.</h2>
<h1>Palindrome Examples</h1>
    <div>
        <h2>Example 1:</h2>
        <p>Input: s = "A man, a plan, a canal: Panama"</p>
        <p>Output: true</p>
        <p>Explanation: "amanaplanacanalpanama" is a palindrome.</p>
    </div>
    <div>
        <h2>Example 2:</h2>
        <p>Input: s = "race a car"</p>
        <p>Output: false</p>
        <p>Explanation: "raceacar" is not a palindrome.</p>
    </div>
    <div>
        <h2>Example 3:</h2>
        <p>Input: s = " "</p>
        <p>Output: true</p>
        <p>Explanation: s is an empty string "" after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome.</p>
    </div>

  <h1>Solution 1: </h1>

<br>
<p><h2> Let's break it down into steps!</h2></p>
<br>
  <ul>
        <li>
            <h2>Step 1: Check for Single Space</h2>
            <p>The method begins by checking if the input string "s" is exactly equal to a single space character " ". If it is, it immediately returns true. This handles the special case where an input string contains only a space and is considered a palindrome.</p>
        </li>
        <li>
            <h2>Step 2: Remove Non-Alphanumeric Characters</h2>
            <p>Next, the code removes all characters from the input string "s" that are not alphanumeric (i.e., not letters or digits) using the replaceAll method and a regular expression "[^A-Za-z0-9]". This effectively removes spaces, punctuation, and any non-alphanumeric characters from the string. The resulting string is then converted to lowercase using the toLowerCase method and stored in the variable "pali."</p>
        </li>
        <li>
            <h2>Step 3: Compare Characters</h2>
            <p>The string "pali" is converted into an array of characters called "tempArray." This array will be used to compare characters from the beginning and end of the string to check for palindromic properties.</p>
            <p>A for loop is used to iterate through the "tempArray" from the beginning to the middle of the array. Inside the loop, it compares characters at positions "i" and "(tempArray.length - 1) - i." If these characters are not equal, the method immediately returns false, indicating that the string is not a palindrome. This loop effectively checks if the string reads the same forwards and backwards by comparing characters symmetrically from the two ends towards the middle.</p>
        </li>
        <li>
            <h2>Step 4: Final Result</h2>
            <p>If the loop completes without finding any unequal characters, the method returns true, indicating that the input string "s" is a palindrome.</p>
        </li>
    </ul>
