package com.exercise.week_one.home;/** * @ClassName: * @Description: * @Author: * @Date: */import java.util.Arrays;/** *@ClassName LeetCode_01_0340两数之和 *@Description *@Autor *@Date 2019/12/1521:27 *@Version 1.0 *@Example **/public class LeetCode_88_0340合并两个有序数组 {    public static void main(String[] args) {        int[] nums1 = {0};        int[] nums2 = {1};        merge(nums1,0,nums2,1);        System.out.println(Arrays.toString(nums1));    }    // 双指针移动    public static void merge(int[] nums1, int m, int[] nums2, int n) {        // 如果2为空，直接return        if (nums2.length < 1) return;        // 如果nums2的第一个数>num1的第一个数，直接把nums2复制到nums1的最后几位        if (m < 1 || nums1[m-1] < nums2[0]) {            System.arraycopy(nums2,0,nums1,m,n);            return;        }        // 利用双指针        int len1 = m-1;        int len2 = n-1;        int len = nums1.length-1;        // 从末尾放入最大值        while (len1 >= 0 && len2 >= 0 ){            nums1[len--] = nums1[len1] > nums2[len2]?nums1[len1--]:nums2[len2--];        }        // num2剩下的为最小值        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);    }}