CREATE TABLE `tb_user` (
                           `id` bigint(20) NOT NULL,
                           `name` varchar(255) DEFAULT NULL,
                           `password` varchar(255) DEFAULT NULL,
                           `create_time` datetime DEFAULT NULL,
                           `update_time` datetime DEFAULT NULL,
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `idx_name` (`name`) USING BTREE COMMENT '用户名唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
