class Solution:
    def twoSum(self, arr: List[int], k: int) -> List[int]:
        ans:List[int]=[]
        map:Dict[int,int]={}
        for i in range(len(arr)):
            complement =k-arr[i]
            if complement in map:
                ans=[i,map[complement]];
                return ans
            map[arr[i]]=i
        return ans