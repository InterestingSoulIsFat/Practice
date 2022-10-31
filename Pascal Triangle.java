/**
    杨辉三角
    生成前numRows行
    1
    11
    121
    1331
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(1);
        res.add(cur);
        if(numRows == 1){
            return res;
        }
        for(int i = 2; i <= numRows; i++){
            cur = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i-1){
                    cur.add(1);
                }else{
                    int num = res.get(i-2).get(j-1) + res.get(i-2).get(j);
                    cur.add(num);
                }
            }
            res.add(cur);
        }
        return res;
    }
}