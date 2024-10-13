<h2>Code Question 1</h2><h3>Medium</h3><hr>

<p>In managing tasks at an analytics platform, the goal is to efficiently schedule both primary and secondary tasks within specified time constraints.</p>

<p>There are <code>n</code> primary tasks and <code>n</code> secondary tasks. Two arrays, <code>primary</code> and <code>secondary</code>, provide information on task hours, where <code>primary[i]</code> represents the duration in hours of the <em>i<sup>th</sup></em> primary task, and <code>secondary[i]</code> represents the duration in hours of the <em>i<sup>th</sup></em> secondary task.</p>

<p>Each day on the platform has a time limit denoted as <code>limit</code> hours. <strong>One primary task must be scheduled each day</strong>. If time remains after the primary task, you can choose to schedule <strong>at most one secondary task</strong> on that day. It is essential to ensure that the total hours do not exceed the specified limit.</p>

<p>Determine the <strong>maximum number of secondary tasks</strong> that can be scheduled during these <code>n</code> days while adhering to the given constraints.</p>

<p>&nbsp;</p>
<p><strong>Example:</strong></p>

<pre><strong>Input:</strong> limit = 7
primary = [4, 5, 2, 4]
secondary = [5, 6, 3, 4]

<strong>Output:</strong> 2

<strong>Explanation:</strong> 
One of the optimal scheduling can be:

Day 1: Schedule the first primary task and the third secondary task. Total time is 4 + 3 = 7.

Day 2: Schedule the second primary task. Total time is 5.

Day 3: Schedule the third primary task and the first secondary task. Total time is 2 + 5 = 7.

Day 4: Schedule the fourth primary task. Total time is 4.

There is no other arrangement of secondary tasks for which more than 2 secondary tasks can be scheduled in 4 days.

Therefore, the maximum number of secondary tasks that can be scheduled during these 4 days is <strong>2</strong>.
</pre>

<p>&nbsp;</p>
<h2>Function Description</h2>
<p>Complete the function <code>getMaximumTasks</code> below.</p>

<p><strong>getMaximumTasks</strong> has the following parameters:</p>

<ul>
    <li><code>int limit</code>: the daily time limit for primary tasks and secondary tasks.</li>
    <li><code>List&lt;Integer&gt; primary</code>: the list containing durations of the primary tasks.</li>
    <li><code>List&lt;Integer&gt; secondary</code>: the list containing durations of the secondary tasks.</li>
</ul>

<p><strong>Returns:</strong></p>

<ul>
    <li><code>int</code>: the maximum number of secondary tasks that can be scheduled during these <code>n</code> days.</li>
</ul>

<p>&nbsp;</p>
<h2>Constraints</h2>

<ul>
    <li><code>1 ≤ n, limit ≤ 200,000</code></li>
    <li><code>1 ≤ primary[i], secondary[i] ≤ limit</code></li>
</ul>
