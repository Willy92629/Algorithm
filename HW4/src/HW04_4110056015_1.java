
public class HW04_4110056015_1 extends doge_coin {

	public static void main(String[] args) {
		HW04_4110056015_1 f = new HW04_4110056015_1();

		int N10[] = {4,6,2,5,6,2,2,1,10,4};
		int N20[] = {3, 27, 21, 33, 32, 35, 7, 40, 24, 22, 15, 1, 14, 4, 20, 31, 39, 10, 5, 17};
		int N2k[] = {5159, 6064, 4018, 9090, 2216, 4648, 7689, 3825, 5366, 1403, 588, 2704, 3480, 7675, 7165, 393, 3254, 6330, 7276, 9758, 2552, 5220, 1019, 7034, 7299, 1359, 7148, 7785, 6873, 8105, 3603, 9036, 7039, 4676, 5234, 2607, 9138, 7046, 3940, 1112, 36, 5763, 3859, 463, 6905, 2465, 1207, 7106, 2557, 8495, 5542, 6084, 9708, 4311, 9648, 6832, 4282, 4160, 9771, 6705, 7472, 1129, 3440, 4451, 5325, 8340, 3279, 1125, 8612, 3763, 3128, 7394, 5555, 108, 965, 6437, 4711, 5894, 9785, 4535, 5530, 9272, 9825, 4846, 4166, 2550, 1834, 7846, 4634, 186, 3676, 8611, 9410, 5811, 4690, 980, 7128, 8396, 6038, 6206, 5133, 8784, 9086, 4191, 5600, 5345, 7715, 6461, 2337, 6226, 7283, 41, 5526, 6806, 6148, 1099, 28, 4741, 498, 4186, 8317, 9186, 695, 4918, 305, 8840, 1306, 8794, 828, 700, 7380, 8281, 9489, 7698, 8334, 1789, 5418, 6323, 4899, 3820, 7734, 854, 6721, 2938, 7200, 3107, 3085, 2483, 2518, 3313, 7258, 5178, 9635, 4134, 2371, 5793, 7609, 6536, 1297, 2585, 2413, 8977, 2640, 7252, 1670, 449, 6516, 2520, 3272, 4908, 4919, 6831, 6943, 798, 8457, 4159, 2100, 4538, 3352, 8471, 1885, 5629, 67, 3073, 5204, 5050, 9568, 2038, 8283, 7976, 1946, 3435, 4528, 6910, 5458, 1126, 8429, 6887, 9837, 9102, 9324, 6426, 5083, 5037, 8756, 6542, 3312, 7844, 5886, 7839, 9274, 9978, 9455, 8237, 1341, 4010, 7035, 7551, 5639, 2787, 577, 9803, 1202, 3278, 27, 3780, 2402, 1173, 563, 4695, 5506, 6899, 6331, 5010, 3618, 9408, 6307, 8047, 8618, 1221, 9553, 8045, 2097, 4637, 2496, 6819, 3288, 6547, 361, 7260, 3539, 4699, 5669, 807, 3580, 5113, 8557, 9076, 2711, 2475, 7144, 4982, 8525, 5770, 4874, 7547, 9119, 3880, 8673, 2669, 7094, 3918, 6848, 9436, 2201, 4295, 9478, 4367, 7695, 5961, 7300, 1439, 8867, 1861, 4897, 9894, 861, 7113, 3846, 5650, 7455, 6777, 4751, 6474, 3427, 9686, 2564, 7377, 7026, 9430, 9053, 7607, 2338, 4035, 8657, 8596, 3391, 6596, 2996, 688, 8225, 3687, 9823, 4247, 4606, 3021, 6443, 3370, 1615, 3195, 7815, 5579, 9943, 2467, 9795, 1200, 6070, 8069, 6865, 9599, 6826, 3998, 4964, 7556, 245, 7091, 7208, 7968, 8272, 9575, 8249, 9987, 2776, 3817, 7313, 8149, 2129, 4414, 6089, 3485, 1638, 1443, 7984, 5912, 1066, 6430, 4549, 8367, 5017, 4672, 777, 9743, 7143, 7932, 6713, 9763, 5254, 7014, 1726, 3006, 8365, 6264, 9853, 8026, 6796, 139, 6327, 2070, 6348, 7012, 3285, 7149, 1980, 1593, 6360, 3316, 2039, 1432, 1178, 2123, 7864, 9676, 2217, 3643, 3651, 6141, 3400, 3327, 5300, 5160, 732, 9672, 1074, 4664, 6942, 4514, 9426, 1846, 5965, 7825, 7138, 1246, 5713, 7164, 8246, 9019, 7680, 585, 2634, 496, 8545, 2645, 7152, 1294, 3609, 8465, 9754, 316, 6257, 1712, 8009, 9350, 136, 7759, 6658, 809, 4768, 3036, 8937, 4656, 5029, 8180, 2040, 6670, 9046, 8483, 2096, 1736, 2575, 1972, 4063, 9177, 6025, 4979, 6420, 8692, 5420, 6753, 4677, 5785, 1170, 3831, 6805, 5789, 3712, 6867, 708, 3883, 7787, 69, 1241, 380, 5247, 268, 8003, 6276, 7145, 7947, 5284, 3081, 6951, 7488, 4355, 350, 9638, 5727, 1747, 1271, 2531, 6531, 5822, 9487, 2695, 5110, 6242, 9774, 2503, 7993, 5679, 699, 1400, 3827, 9597, 3567, 1945, 5252, 2484, 5080, 5720, 2971, 1158, 8121, 8511, 3108, 2644, 8379, 3398, 4505, 1317, 6754, 8, 5457, 8108, 9723, 819, 6789, 709, 1790, 6571, 1046, 2283, 5634, 9243, 1681, 5859, 5773, 2915, 2031, 7207, 2390, 9507, 6633, 4198, 4954, 265, 9725, 9329, 3713, 2894, 7895, 1647, 2698, 5137, 5369, 9150, 1461, 9108, 1823, 2884, 383, 7086, 8528, 6881, 5803, 8222, 3208, 9967, 9188, 7058, 2317, 1407, 9185, 8171, 9731, 6383, 5570, 2601, 959, 4958, 5427, 7501, 1205, 9850, 7223, 5188, 634, 6454, 7499, 9583, 4747, 5619, 4248, 1844, 5917, 4446, 7261, 4094, 9327, 3415, 1978, 3295, 8658, 4099, 9698, 4092, 4228, 5101, 8671, 849, 1905, 9100, 6388, 6256, 1191, 4461, 2902, 9388, 8681, 244, 4078, 3544, 6014, 6602, 7570, 7939, 6797, 6320, 6024, 2825, 5914, 966, 9574, 8242, 826, 5907, 5015, 1192, 4394, 5954, 4395, 7693, 4280, 637, 1244, 9413, 6817, 7359, 397, 1398, 7578, 9062, 2286, 7069, 3948, 5205, 9449, 744, 1138, 2234, 2018, 934, 8385, 9578, 7854, 3218, 9607, 1385, 2251, 9201, 8770, 5694, 5135, 8959, 2072, 1813, 2385, 8964, 6230, 8321, 8253, 5018, 5012, 4064, 2914, 7927, 8722, 6974, 422, 6575, 5216, 1735, 2453, 2255, 1567, 7135, 8130, 4487, 909, 3341, 8095, 2876, 3127, 7305, 8426, 3051, 6150, 933, 754, 4546, 1094, 7187, 8865, 4300, 3307, 8362, 1720, 5498, 59, 716, 6972, 4717, 2417, 9143, 3934, 7853, 3527, 6475, 5903, 8593, 9305, 8805, 5071, 5546, 8564, 1382, 7980, 9135, 5229, 3428, 3886, 5807, 9619, 3357, 7147, 2041, 2400, 3540, 2310, 5777, 7092, 3935, 901, 8359, 8623, 832, 9589, 2988, 2118, 793, 9584, 4643, 8792, 4209, 5576, 8863, 1588, 7450, 5441, 1717, 9776, 371, 2547, 6761, 7141, 7132, 5161, 5368, 3777, 2800, 9362, 6020, 2291, 6162, 3640, 3155, 4557, 2260, 529, 8544, 3029, 9047, 2505, 4485, 98, 4411, 6144, 9349, 3707, 2596, 3163, 7789, 1433, 1656, 5522, 5580, 7055, 2795, 2435, 9330, 6237, 4123, 9586, 9779, 9356, 4069, 487, 7483, 6048, 4809, 1716, 9838, 4171, 3506, 7457, 5717, 3604, 8925, 5409, 1245, 882, 8702, 2811, 9406, 4687, 7858, 1015, 2833, 1387, 295, 8608, 373, 5899, 7804, 9913, 7211, 3448, 5682, 1293, 6669, 7158, 5114, 6847, 345, 5764, 3293, 2551, 1882, 3991, 1364, 3456, 3099, 5543, 9947, 8998, 3244, 274, 4340, 2416, 2563, 2972, 6543, 52, 1598, 2267, 4817, 9160, 490, 939, 8250, 5670, 9096, 167, 3063, 7861, 3542, 6615, 2374, 5855, 8752, 3962, 3564, 7375, 7718, 3999, 9907, 9722, 6480, 9538, 6032, 6664, 1921, 4642, 983, 7343, 4163, 1876, 1030, 5209, 4600, 2395, 6628, 2953, 3386, 841, 5749, 362, 1213, 7266, 470, 2576, 1484, 4839, 6207, 3711, 8115, 2082, 2731, 8839, 4507, 8096, 4760, 7725, 1987, 2078, 4638, 6743, 8453, 3861, 4531, 8952, 9443, 6869, 4764, 329, 2729, 7996, 4705, 4330, 7879, 2546, 2290, 7218, 638, 1084, 5929, 1547, 9322, 4978, 5832, 4022, 6970, 5246, 1829, 8304, 3814, 7841, 7424, 6695, 5599, 7946, 1928, 399, 5068, 1850, 5479, 1771, 3147, 2603, 717, 630, 658, 9071, 2455, 3970, 3629, 1214, 4293, 2942, 5499, 3515, 5545, 1889, 7360, 610, 8975, 9029, 607, 3491, 1033, 6389, 127, 3858, 2624, 8083, 1157, 2346, 9231, 6990, 6661, 1376, 1993, 8434, 2900, 3689, 9694, 3960, 1949, 9204, 3752, 1538, 561, 2846, 8868, 7662, 2524, 293, 1354, 78, 121, 3611, 2790, 8912, 9749, 289, 4096, 2764, 4504, 6058, 6904, 8882, 3584, 2268, 2676, 4825, 14, 1707, 2023, 6505, 2619, 5241, 1989, 6372, 5147, 8764, 5193, 7167, 2486, 1463, 6709, 2052, 3725, 9938, 9720, 9951, 3169, 1457, 2056, 8248, 1553, 7941, 801, 5880, 6205, 6130, 8675, 8819, 3906, 1690, 5781, 4710, 8932, 4787, 3693, 2226, 3670, 4949, 3372, 406, 8609, 8518, 3, 5606, 3478, 928, 2526, 4659, 13, 2680, 8601, 1325, 5169, 5096, 9416, 1595, 8196, 4299, 63, 7599, 9564, 3524, 4640, 5487, 7430, 3516, 8276, 5122, 4583, 9764, 6184, 6304, 7819, 6973, 1927, 1660, 6631, 3881, 2396, 7060, 1550, 9523, 8663, 2249, 5448, 9982, 5374, 8803, 9573, 5706, 9692, 5069, 623, 6485, 2519, 2431, 1556, 7866, 7730, 7544, 2775, 4013, 2648, 7597, 5309, 3424, 2079, 5237, 7081, 9502, 1831, 1560, 7708, 6925, 768, 1123, 5367, 7652, 5081, 411, 2976, 5995, 7083, 9847, 6677, 6975, 4303, 554, 9266, 1898, 9612, 8424, 5428, 4869, 922, 3472, 4070, 331, 7665, 1120, 7308, 2643, 3389, 5649, 5692, 2981, 3619, 7048, 3944, 7692, 3280, 5370, 4053, 8432, 7230, 633, 5171, 5754, 6011, 5824, 2865, 9057, 1742, 8298, 2599, 2973, 9778, 6473, 1386, 5038, 1132, 5155, 2573, 2147, 7037, 7259, 6823, 5285, 4393, 5921, 5661, 7016, 6636, 8162, 9784, 7042, 8255, 7545, 1366, 6846, 3226, 2784, 4066, 1543, 6265, 8529, 743, 4164, 4357, 865, 4950, 8729, 1370, 9499, 8723, 6562, 1052, 2985, 4177, 1345, 9337, 8366, 4779, 2618, 292, 3791, 1075, 4319, 6319, 846, 7535, 6466, 2928, 2688, 4087, 8323, 5602, 7781, 9709, 8510, 7979, 9048, 3354, 2948, 8845, 7146, 3019, 6763, 993, 9705, 7837, 2487, 3862, 4127, 7670, 869, 4004, 5264, 30, 8167, 7870, 1671, 2913, 1121, 8644, 6104, 7109, 4547, 439, 3379, 5786, 4651, 5525, 3569, 157, 5127, 2994, 6036, 6498, 2063, 5085, 6766, 4920, 2370, 5820, 7390, 4084, 5355, 431, 6134, 7327, 3104, 1156, 2308, 3447, 9782, 1102, 9174, 8381, 8050, 3860, 866, 3224, 6920, 4142, 1658, 8182, 7269, 906, 3802, 6431, 8274, 3987, 5124, 6521, 2227, 6481, 6599, 4993, 562, 9131, 3469, 7878, 3984, 1380, 3346, 8991, 6598, 8918, 5608, 7991, 1504, 2235, 3436, 4510, 7421, 7494, 3806, 8711, 7546, 2987, 3000, 320, 9067, 7606, 2335, 7338, 3467, 7431, 8301, 8687, 9380, 6784, 6220, 5434, 6212, 7392, 6310, 8982, 731, 2817, 49, 1218, 3513, 3562, 2978, 8829, 3822, 4683, 1752, 3514, 7195, 7117, 2802, 2753, 1003, 3034, 5251, 255, 3892, 3464, 1812, 3985, 6306, 4709, 6002, 3149, 7262, 5833, 7729, 4753, 2838, 8319, 7107, 1016, 7161, 1767, 3525, 4981, 9395, 9513, 5307, 8517, 3794, 5417, 2848, 9460, 2522, 6783, 6109, 4929, 8553, 1520, 948, 8914, 6992, 1082, 4292, 3997, 8694, 6588, 1554, 4276, 6825, 5187, 1843, 5335, 7524, 5342, 9475, 2446, 8258, 4204, 6062, 6525, 5931, 4088, 5334, 3565, 8036, 7066, 2826, 1027, 4029, 4434, 3174, 4987, 6775, 1278, 2165, 6818, 9381, 726, 6948, 4916, 5356, 7696, 1865, 8499, 8547, 7209, 4848, 6112, 9868, 7779, 9254, 3795, 7827, 6429, 7425, 3251, 5544, 7857, 3766, 2199, 4401, 2387, 2257, 2590, 3624, 9934, 1186, 8789, 4026, 2739, 5121, 9498, 6138, 2329, 1486, 2850, 2872, 2302, 3869, 3659, 354, 4118, 4974, 2990, 5744, 9609, 7306, 7436, 395, 4636, 2559, 9980, 553, 6463, 9895, 624, 7648, 9072, 8324, 5604, 8951, 9422, 8348, 8503, 9064, 8090, 1013, 6957, 3077, 1587, 3455, 2373, 234, 9287, 9268, 6608, 9801, 2439, 5404, 6793, 6929, 1315, 7345, 7096, 8232, 2735, 1807, 6663, 1319, 1232, 8216, 8156, 5588, 5815, 6877, 3719, 9806, 9726, 6755, 8954, 437, 7743, 9993, 4108, 4021, 2492, 2504, 9187, 9896, 3133, 9567, 6996, 779, 2558, 7486, 8994, 9005, 8685, 4109, 6671, 1274, 8391, 4031, 6441, 1963, 3508, 7401, 5405, 5321, 9393, 7550, 6799, 3243, 7395, 1599, 7357, 7832, 9845, 4449, 6345, 8247, 9955, 2982, 5794, 1049, 951, 8191, 565, 6433, 2200, 548, 9793, 6794, 9013, 4525, 5042, 1728, 3757, 8896, 9026, 3646, 8847, 3679, 2851, 9587, 1464, 5173, 8835, 1031, 8387, 3811, 9644, 537, 2093, 5901, 7093, 3900, 4044, 8435, 3501, 7444, 864, 6042, 3135, 4250, 1821, 7126, 1428, 3461, 1193, 4239, 692, 5578, 8390, 4900, 6223, 2692, 7278, 1332, 2424, 508, 7922, 3947, 6537, 6350, 7382, 8127, 1649, 8583, 9345, 6774, 5938, 2916, 845, 3536, 2411, 7010, 4112, 9172, 2037, 8728, 7881, 9863, 24, 8371, 7575, 6864, 7875, 8270, 7795, 2007, 7272, 7371, 5031, 7831, 9621, 5408, 2250, 8746, 9824, 1163, 3032, 4146, 1760, 7880, 9918, 7786, 5270, 2252, 4431, 8022, 8235, 3823, 6551, 8445, 8948, 5423, 4405, 3475, 5385, 7581, 4719, 5747, 9360, 86, 9162, 7562, 1714, 5389, 3286, 4302, 4806, 6849, 4805, 6391, 9257, 8549, 9453, 3799, 1206, 7971, 6034, 3092, 3583, 8294, 301, 9196, 8947, 8961, 2567, 9656, 9480, 3743, 8880, 4254, 9463, 7404, 1558, 228, 7355, 7320, 1965, 3333, 435, 9263, 842, 7821, 5752, 7965, 9033, 7162, 4613, 47, 8308, 2995, 5554, 9500, 2466, 4513, 8578, 8077, 3773, 8460, 722, 6758, 8185, 4889, 4079, 903, 3953, 3179, 4097, 6353, 3399, 581, 4412, 2068, 7078, 8563, 9045, 9250, 2419, 858, 6483, 862, 8516, 2785, 8875, 1009, 3130, 392, 4349, 5136, 9022, 2934, 4661, 649, 2071, 376, 2196, 2839, 3832, 8942, 4074, 776, 1746, 8721, 9452, 8241, 8046, 7315, 2349, 2768, 9425, 9882, 1111, 1527, 6177, 6722, 7243, 8634, 3913, 1769, 2956, 4843, 9123, 2101, 6949, 4935, 6399, 8864, 9059, 9348, 8336, 6917, 9377, 7027, 1168, 4224, 7298, 3457, 3401, 3630, 1521, 2436, 4038, 1810, 6717, 409, 3483, 2067, 3265, 8098, 1078, 5941, 8949, 9089, 1308, 8267, 3201, 6913, 4237, 2993, 2780, 1350, 107, 6635, 3958, 2294, 7624, 580, 5730, 7987, 3388, 114, 7850, 2295, 5945, 7372, 9995, 9836, 3462, 8291, 453, 8020, 8846, 25, 1177, 1579, 3274, 9665, 3850, 2233, 9446, 1226, 5003, 5051, 651, 3961, 456, 384, 9971, 8751, 1133, 7011, 6662, 8635, 820, 6188, 9579, 9940, 7321, 129, 7653, 3255, 375, 1085, 3616, 142, 9881, 5919, 4312, 1552, 3052, 878, 9140, 6501, 8261, 7166, 6729, 4287, 1770, 3929, 7506, 7177, 3258, 1198, 8268, 7666, 1586, 9549, 4242, 4707, 9632, 4590, 3836, 7740
		};


		long t1 = System.nanoTime();
		int R10 = f.doge(N10);
		long t2 = System.nanoTime();
		int R20 = f.doge(N20);
		long t3 = System.nanoTime();
		int R2k = f.doge(N2k);
		long t4 = System.nanoTime();
		
		System.out.println("N:10 "+R10);
		System.out.printf(" Time : %010d\n",(t2-t1));
		System.out.println("N:20 "+R20);
		System.out.printf(" Time : %010d\n",(t3-t2));
		System.out.println("N:2000 "+R2k);
		System.out.printf(" Time : %010d\n",(t4-t3));
		
		System.out.printf("ATime : %010d",t4-t1);
	}
	
	public int doge(int[] a) {
		int earn = 0,scanmin = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]<scanmin) {
				scanmin = a[i];
			}else if(a[i]-scanmin > earn) {
				earn = a[i]-scanmin;
			}
		}
		return earn;
	}

}
