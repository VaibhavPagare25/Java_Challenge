
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int m, int n)
    {

        if (matrix.length == 0)
        return new ArrayList<>();

        m = matrix.length;
        n = matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int r1 = 0;
        int c1 = 0;
        int r2 = m - 1;
        int c2 = n - 1;

        while (ans.size() < m * n) {
        for (int j = c1; j <= c2 && ans.size() < m * n; ++j)
            ans.add(matrix[r1][j]);
        for (int i = r1 + 1; i <= r2 - 1 && ans.size() < m * n; ++i)
            ans.add(matrix[i][c2]);
        for (int j = c2; j >= c1 && ans.size() < m * n; --j)
            ans.add(matrix[r2][j]);
        for (int i = r2 - 1; i >= r1 + 1 && ans.size() < m * n; --i)
            ans.add(matrix[i][c1]);
        ++r1;
        ++c1;
        --r2;
        --c2;
    }

    return ans;
    }
}

