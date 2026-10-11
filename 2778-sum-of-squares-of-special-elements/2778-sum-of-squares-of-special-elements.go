func sumOfSquares(nums []int) int {
    var n int = len(nums)
    sum:=0
    for i:=0; i < n ; i++ {
        if n%(i+1) == 0 {
            sum = sum + (nums[i]*nums[i])
        }
    }
    return sum   
}