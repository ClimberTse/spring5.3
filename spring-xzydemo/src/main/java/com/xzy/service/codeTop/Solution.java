package com.xzy.service.codeTop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int target = -nums[i];

			//和前一元素相同则跳过
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int k = nums.length - 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}

				while (j < k && nums[j] + nums[k] > target) {
					k--;
				}

				if (j == k) {
					break;
				}
				if (nums[j] + nums[k] == target) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					result.add(list);
				}
			}
		}
		return result;
	}
}