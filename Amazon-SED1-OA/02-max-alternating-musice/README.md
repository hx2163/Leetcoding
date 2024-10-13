<h2>Code Question 2</h2><h3>Medium</h3><hr>

<p>Amazon Music is working on harmonizing their music playlist.</p>

<p>In their playlist system, each song is represented by a binary string <code>music</code> where <code>'0'</code> and <code>'1'</code> denote two different types of music, say TypeA and TypeB. An "<strong>alternating music string</strong>" is one where no two adjacent songs are of the same type. For example, <code>"1"</code>, <code>"0"</code>, <code>"10"</code>, <code>"01"</code>, <code>"101"</code> are alternating music strings.</p>

<p>Given a binary string <code>music</code> representing the playlist and an integer <code>k</code>, you can perform up to <code>k</code> operations where each operation involves flipping a character, i.e., turning <code>'0'</code> into <code>'1'</code> and <code>'1'</code> into <code>'0'</code>.</p>

<p>As a developer at Amazon, the task is to determine the <strong>longest alternating substring</strong> that can be obtained from the <code>music</code> string by performing at most <code>k</code> operations.</p>

<p><strong>Note:</strong></p>

<ul>
    <li>A binary string is a sequence of <code>'0'</code> and <code>'1'</code> characters.</li>
    <li>A string <code>A</code> is a substring of a string <code>B</code> if <code>A</code> can be obtained from <code>B</code> by deleting several (possibly, zero or all) characters from the beginning and several (possibly, zero or all) characters from the end.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Example:</strong></p>

<pre><strong>Input:</strong> music = "1001", k = 1

<strong>Output:</strong> 3

<strong>Explanation:</strong> 
By flipping the third character, the string becomes music = "1011". The longest alternating music string in this modified string is "101", which spans from the 0th index to the 2nd index and has a length of 3. With only one operation, it is not possible to obtain a longer alternating binary substring. Thus, the answer is <strong>3</strong>.
</pre>

<p>&nbsp;</p>
<h2>Function Description</h2>
<p>Complete the function <code>getMaxAlternatingMusic</code> below.</p>

<p><strong>getMaxAlternatingMusic</strong> has the following parameters:</p>

<ul>
    <li><code>string music</code>: a string of characters <code>'0'</code> and <code>'1'</code>.</li>
    <li><code>int k</code>: the number of operations allowed.</li>
</ul>

<p><strong>Returns:</strong></p>

<ul>
    <li><code>int</code>: the length of the longest alternating music substring that can be obtained in the given string <code>music</code>.</li>
</ul>

<p>&nbsp;</p>
<h2>Constraints</h2>

<ul>
    <li><code>1 ≤ |music| ≤ 10<sup>5</sup></code></li>
    <li><code>1 ≤ k ≤ |music|</code></li>
    <li><code>music</code> consists of the characters <code>'0'</code> and <code>'1'</code>.</li>
</ul>
