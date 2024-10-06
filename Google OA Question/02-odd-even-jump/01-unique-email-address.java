import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        // 创建一个 HashSet 来存储唯一的电子邮件地址
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            // 将邮件地址分割为本地名和域名
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // 移除本地名中的所有 '.'，并忽略 '+' 号之后的部分
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+')); // 只取 '+' 之前的部分
            }
            local = local.replace(".", ""); // 移除所有 '.'

            // 将处理后的本地名与域名组合起来，加入 HashSet 中
            uniqueEmails.add(local + "@" + domain);
        }

        // 返回 HashSet 中唯一电子邮件地址的数量
        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] emails = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };

        // 输出: 2
        System.out.println(solution.numUniqueEmails(emails));

        String[] emails2 = {
            "a@leetcode.com",
            "b@leetcode.com",
            "c@leetcode.com"
        };

        // 输出: 3
        System.out.println(solution.numUniqueEmails(emails2));
    }
}
