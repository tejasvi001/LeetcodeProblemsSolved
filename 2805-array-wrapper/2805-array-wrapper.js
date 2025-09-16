/**
 * @param {number[]} nums
 * @return {void}
 */
var ArrayWrapper = function(nums) {
    this.nums = nums;
    this.res = 0;
    return this.res;
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function() {
  this.res += this.nums.reduce((n,a)=>n+a,0);
  return this.res;
}

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function() {
    this.res = JSON.stringify(this.nums);
    return this.res;
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */