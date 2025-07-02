/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const map = new Map();

    for (const item of arr1) {
        if ("id" in item) map.set(item.id, item);
    }

    for (const item of arr2) {
        if ("id" in item) {
            const id = item.id;
            map.set(id, map.has(id) ? { ...map.get(id), ...item } : item);
        }
    }

    return Array.from(map.values()).sort((a, b) => a.id - b.id);
};