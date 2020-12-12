-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost:3306
-- Thời gian đã tạo: Th12 12, 2020 lúc 11:15 AM
-- Phiên bản máy phục vụ: 8.0.22-0ubuntu0.20.04.3
-- Phiên bản PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `itss`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Actions`
--

CREATE TABLE `Actions` (
  `action_id` int NOT NULL,
  `action_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Addresses`
--

CREATE TABLE `Addresses` (
  `address_id` int NOT NULL,
  `note` varchar(45) NOT NULL,
  `ward_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Books`
--

CREATE TABLE `Books` (
  `publication_date` timestamp NULL DEFAULT NULL,
  `page_number` int NOT NULL,
  `media_id` bigint NOT NULL,
  `cover_type_id` int NOT NULL,
  `publisher_name` varchar(255) DEFAULT NULL,
  `language_id` int NOT NULL,
  `author_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `CartItems`
--

CREATE TABLE `CartItems` (
  `media_id` bigint NOT NULL,
  `price` int NOT NULL,
  `quantity` int NOT NULL,
  `user_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Categories`
--

CREATE TABLE `Categories` (
  `category_id` int NOT NULL,
  `category_name` varchar(45) NOT NULL,
  `is_physical_good?` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `CDs`
--

CREATE TABLE `CDs` (
  `publication_date` timestamp NULL DEFAULT NULL,
  `media_id` bigint NOT NULL,
  `record_label_name` varchar(255) DEFAULT NULL,
  `artist_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `CoverTypes`
--

CREATE TABLE `CoverTypes` (
  `cover_type_id` int NOT NULL,
  `cover_type_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Districts`
--

CREATE TABLE `Districts` (
  `district_id` int NOT NULL,
  `district_name` varchar(45) NOT NULL,
  `province_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `DVDs`
--

CREATE TABLE `DVDs` (
  `publication_date` timestamp NULL DEFAULT NULL,
  `runtime` int DEFAULT NULL,
  `subtitle` text,
  `media_id` bigint NOT NULL,
  `language_id` int NOT NULL,
  `studio_name` varchar(255) DEFAULT NULL,
  `dvd_type_id` int NOT NULL,
  `action_name` varchar(255) DEFAULT NULL,
  `writer_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `DVDTypes`
--

CREATE TABLE `DVDTypes` (
  `dvd_type_id` int NOT NULL,
  `dvd_type_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `EGoods`
--

CREATE TABLE `EGoods` (
  `media_id` bigint NOT NULL,
  `content` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `HistoryActions`
--

CREATE TABLE `HistoryActions` (
  `date` datetime NOT NULL,
  `action_id` int NOT NULL,
  `note` varchar(45) DEFAULT NULL,
  `user_id` int NOT NULL,
  `media_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Languages`
--

CREATE TABLE `Languages` (
  `language_id` int NOT NULL,
  `language_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Medias`
--

CREATE TABLE `Medias` (
  `media_id` bigint NOT NULL,
  `title` varchar(255) NOT NULL,
  `value` int NOT NULL DEFAULT '0',
  `price` int NOT NULL DEFAULT '0',
  `category_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `MediaSales`
--

CREATE TABLE `MediaSales` (
  `sale_id` int NOT NULL,
  `media_id` bigint NOT NULL,
  `quantity` int NOT NULL DEFAULT '1',
  `percent` decimal(2,2) NOT NULL DEFAULT '0.00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `OrderItems`
--

CREATE TABLE `OrderItems` (
  `media_id` bigint NOT NULL,
  `order_id` int NOT NULL,
  `price` int NOT NULL,
  `quantity` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Orders`
--

CREATE TABLE `Orders` (
  `order_id` int NOT NULL,
  `ship_fee` float NOT NULL,
  `order_state_id` int NOT NULL,
  `shipping_info_id` int NOT NULL,
  `user_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `OrderState`
--

CREATE TABLE `OrderState` (
  `order_state_id` int NOT NULL,
  `order_state_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `PhysicalGoods`
--

CREATE TABLE `PhysicalGoods` (
  `barcode` int NOT NULL,
  `description` text,
  `quantity` int NOT NULL DEFAULT '0',
  `dimension` float NOT NULL DEFAULT '0',
  `size` varchar(45) DEFAULT '0',
  `input_day` timestamp NOT NULL,
  `media_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Provinces`
--

CREATE TABLE `Provinces` (
  `province_id` int NOT NULL,
  `province_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Sales`
--

CREATE TABLE `Sales` (
  `sale_id` int NOT NULL,
  `start_day` timestamp NOT NULL,
  `end_day` timestamp NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ShippingInfos`
--

CREATE TABLE `ShippingInfos` (
  `shipping_info_id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `delivery_instruction` varchar(45) NOT NULL,
  `user_id` int NOT NULL,
  `address_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `TrackLists`
--

CREATE TABLE `TrackLists` (
  `track_id` int NOT NULL,
  `media_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Tracks`
--

CREATE TABLE `Tracks` (
  `track_id` int NOT NULL,
  `track_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Users`
--

CREATE TABLE `Users` (
  `user_id` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `is_admin?` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `Wards`
--

CREATE TABLE `Wards` (
  `ward_id` int NOT NULL,
  `ward_name` varchar(45) NOT NULL,
  `district_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `Actions`
--
ALTER TABLE `Actions`
  ADD PRIMARY KEY (`action_id`);

--
-- Chỉ mục cho bảng `Addresses`
--
ALTER TABLE `Addresses`
  ADD PRIMARY KEY (`address_id`),
  ADD KEY `fk_Addresses_SubDistricts1_idx` (`ward_id`);

--
-- Chỉ mục cho bảng `Books`
--
ALTER TABLE `Books`
  ADD PRIMARY KEY (`media_id`),
  ADD KEY `fk_Books_CoverTypes1_idx` (`cover_type_id`),
  ADD KEY `fk_Books_Languages1_idx` (`language_id`);

--
-- Chỉ mục cho bảng `CartItems`
--
ALTER TABLE `CartItems`
  ADD PRIMARY KEY (`media_id`,`user_id`),
  ADD KEY `fk_CartItems_Medias1_idx` (`media_id`),
  ADD KEY `fk_CartItems_Users1_idx` (`user_id`);

--
-- Chỉ mục cho bảng `Categories`
--
ALTER TABLE `Categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Chỉ mục cho bảng `CDs`
--
ALTER TABLE `CDs`
  ADD PRIMARY KEY (`media_id`);

--
-- Chỉ mục cho bảng `CoverTypes`
--
ALTER TABLE `CoverTypes`
  ADD PRIMARY KEY (`cover_type_id`);

--
-- Chỉ mục cho bảng `Districts`
--
ALTER TABLE `Districts`
  ADD PRIMARY KEY (`district_id`),
  ADD KEY `fk_Districts_Provinces1_idx` (`province_id`);

--
-- Chỉ mục cho bảng `DVDs`
--
ALTER TABLE `DVDs`
  ADD PRIMARY KEY (`media_id`),
  ADD KEY `fk_DVDs_Languages1_idx` (`language_id`),
  ADD KEY `fk_DVDs_DVDTypes1_idx` (`dvd_type_id`);

--
-- Chỉ mục cho bảng `DVDTypes`
--
ALTER TABLE `DVDTypes`
  ADD PRIMARY KEY (`dvd_type_id`);

--
-- Chỉ mục cho bảng `EGoods`
--
ALTER TABLE `EGoods`
  ADD PRIMARY KEY (`media_id`);

--
-- Chỉ mục cho bảng `HistoryActions`
--
ALTER TABLE `HistoryActions`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `fk_HistoryActions_Actions1_idx` (`action_id`),
  ADD KEY `fk_HistoryActions_Users1_idx` (`user_id`),
  ADD KEY `fk_HistoryActions_Medias1_idx` (`media_id`);

--
-- Chỉ mục cho bảng `Languages`
--
ALTER TABLE `Languages`
  ADD PRIMARY KEY (`language_id`);

--
-- Chỉ mục cho bảng `Medias`
--
ALTER TABLE `Medias`
  ADD PRIMARY KEY (`media_id`),
  ADD KEY `fk_Medias_Categories1_idx` (`category_id`);

--
-- Chỉ mục cho bảng `MediaSales`
--
ALTER TABLE `MediaSales`
  ADD PRIMARY KEY (`sale_id`,`media_id`),
  ADD KEY `fk_MediaSales_Medias1_idx` (`media_id`);

--
-- Chỉ mục cho bảng `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD KEY `fk_OrderItems_Medias1_idx` (`media_id`),
  ADD KEY `fk_OrderItems_Orders1_idx` (`order_id`);

--
-- Chỉ mục cho bảng `Orders`
--
ALTER TABLE `Orders`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `fk_Orders_OrderState1_idx` (`order_state_id`),
  ADD KEY `fk_Orders_ShippingInfos1_idx` (`shipping_info_id`),
  ADD KEY `fk_Orders_Users1_idx` (`user_id`);

--
-- Chỉ mục cho bảng `OrderState`
--
ALTER TABLE `OrderState`
  ADD PRIMARY KEY (`order_state_id`);

--
-- Chỉ mục cho bảng `PhysicalGoods`
--
ALTER TABLE `PhysicalGoods`
  ADD PRIMARY KEY (`media_id`);

--
-- Chỉ mục cho bảng `Provinces`
--
ALTER TABLE `Provinces`
  ADD PRIMARY KEY (`province_id`);

--
-- Chỉ mục cho bảng `Sales`
--
ALTER TABLE `Sales`
  ADD PRIMARY KEY (`sale_id`);

--
-- Chỉ mục cho bảng `ShippingInfos`
--
ALTER TABLE `ShippingInfos`
  ADD PRIMARY KEY (`shipping_info_id`,`user_id`),
  ADD KEY `fk_ShippingInfos_Users1_idx` (`user_id`),
  ADD KEY `fk_ShippingInfos_Addresses1_idx` (`address_id`);

--
-- Chỉ mục cho bảng `TrackLists`
--
ALTER TABLE `TrackLists`
  ADD PRIMARY KEY (`track_id`,`media_id`),
  ADD KEY `fk_TrackLists_Tracks1_idx` (`track_id`),
  ADD KEY `fk_TrackLists_CDs1_idx` (`media_id`);

--
-- Chỉ mục cho bảng `Tracks`
--
ALTER TABLE `Tracks`
  ADD PRIMARY KEY (`track_id`);

--
-- Chỉ mục cho bảng `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`);

--
-- Chỉ mục cho bảng `Wards`
--
ALTER TABLE `Wards`
  ADD PRIMARY KEY (`ward_id`),
  ADD KEY `fk_SubDistricts_Districts1_idx` (`district_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `Actions`
--
ALTER TABLE `Actions`
  MODIFY `action_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Addresses`
--
ALTER TABLE `Addresses`
  MODIFY `address_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Categories`
--
ALTER TABLE `Categories`
  MODIFY `category_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `CoverTypes`
--
ALTER TABLE `CoverTypes`
  MODIFY `cover_type_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `DVDTypes`
--
ALTER TABLE `DVDTypes`
  MODIFY `dvd_type_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Languages`
--
ALTER TABLE `Languages`
  MODIFY `language_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Medias`
--
ALTER TABLE `Medias`
  MODIFY `media_id` bigint NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Orders`
--
ALTER TABLE `Orders`
  MODIFY `order_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `OrderState`
--
ALTER TABLE `OrderState`
  MODIFY `order_state_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Sales`
--
ALTER TABLE `Sales`
  MODIFY `sale_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `ShippingInfos`
--
ALTER TABLE `ShippingInfos`
  MODIFY `shipping_info_id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `Tracks`
--
ALTER TABLE `Tracks`
  MODIFY `track_id` int NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `Addresses`
--
ALTER TABLE `Addresses`
  ADD CONSTRAINT `fk_Addresses_SubDistricts1` FOREIGN KEY (`ward_id`) REFERENCES `Wards` (`ward_id`);

--
-- Các ràng buộc cho bảng `Books`
--
ALTER TABLE `Books`
  ADD CONSTRAINT `fk_Books_CoverTypes1` FOREIGN KEY (`cover_type_id`) REFERENCES `CoverTypes` (`cover_type_id`),
  ADD CONSTRAINT `fk_Books_Languages1` FOREIGN KEY (`language_id`) REFERENCES `Languages` (`language_id`),
  ADD CONSTRAINT `fk_Books_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`);

--
-- Các ràng buộc cho bảng `CartItems`
--
ALTER TABLE `CartItems`
  ADD CONSTRAINT `fk_CartItems_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`),
  ADD CONSTRAINT `fk_CartItems_Users1` FOREIGN KEY (`user_id`) REFERENCES `Users` (`user_id`);

--
-- Các ràng buộc cho bảng `CDs`
--
ALTER TABLE `CDs`
  ADD CONSTRAINT `fk_CDs_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`);

--
-- Các ràng buộc cho bảng `Districts`
--
ALTER TABLE `Districts`
  ADD CONSTRAINT `fk_Districts_Provinces1` FOREIGN KEY (`province_id`) REFERENCES `Provinces` (`province_id`);

--
-- Các ràng buộc cho bảng `DVDs`
--
ALTER TABLE `DVDs`
  ADD CONSTRAINT `fk_DVDs_DVDTypes1` FOREIGN KEY (`dvd_type_id`) REFERENCES `DVDTypes` (`dvd_type_id`),
  ADD CONSTRAINT `fk_DVDs_Languages1` FOREIGN KEY (`language_id`) REFERENCES `Languages` (`language_id`),
  ADD CONSTRAINT `fk_DVDs_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`);

--
-- Các ràng buộc cho bảng `EGoods`
--
ALTER TABLE `EGoods`
  ADD CONSTRAINT `fk_eGoods_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`);

--
-- Các ràng buộc cho bảng `HistoryActions`
--
ALTER TABLE `HistoryActions`
  ADD CONSTRAINT `fk_HistoryActions_Actions1` FOREIGN KEY (`action_id`) REFERENCES `Actions` (`action_id`),
  ADD CONSTRAINT `fk_HistoryActions_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`),
  ADD CONSTRAINT `fk_HistoryActions_Users1` FOREIGN KEY (`user_id`) REFERENCES `Users` (`user_id`);

--
-- Các ràng buộc cho bảng `Medias`
--
ALTER TABLE `Medias`
  ADD CONSTRAINT `fk_Medias_Categories1` FOREIGN KEY (`category_id`) REFERENCES `Categories` (`category_id`);

--
-- Các ràng buộc cho bảng `MediaSales`
--
ALTER TABLE `MediaSales`
  ADD CONSTRAINT `fk_MediaSales_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`),
  ADD CONSTRAINT `fk_MediaSales_Sales1` FOREIGN KEY (`sale_id`) REFERENCES `Sales` (`sale_id`);

--
-- Các ràng buộc cho bảng `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD CONSTRAINT `fk_OrderItems_Medias1` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`),
  ADD CONSTRAINT `fk_OrderItems_Orders1` FOREIGN KEY (`order_id`) REFERENCES `Orders` (`order_id`);

--
-- Các ràng buộc cho bảng `Orders`
--
ALTER TABLE `Orders`
  ADD CONSTRAINT `fk_Orders_OrderState1` FOREIGN KEY (`order_state_id`) REFERENCES `OrderState` (`order_state_id`),
  ADD CONSTRAINT `fk_Orders_ShippingInfos1` FOREIGN KEY (`shipping_info_id`) REFERENCES `ShippingInfos` (`shipping_info_id`),
  ADD CONSTRAINT `fk_Orders_Users1` FOREIGN KEY (`user_id`) REFERENCES `Users` (`user_id`);

--
-- Các ràng buộc cho bảng `PhysicalGoods`
--
ALTER TABLE `PhysicalGoods`
  ADD CONSTRAINT `fk_PhysicalGoods_Medias` FOREIGN KEY (`media_id`) REFERENCES `Medias` (`media_id`);

--
-- Các ràng buộc cho bảng `ShippingInfos`
--
ALTER TABLE `ShippingInfos`
  ADD CONSTRAINT `fk_ShippingInfos_Addresses1` FOREIGN KEY (`address_id`) REFERENCES `Addresses` (`address_id`),
  ADD CONSTRAINT `fk_ShippingInfos_Users1` FOREIGN KEY (`user_id`) REFERENCES `Users` (`user_id`);

--
-- Các ràng buộc cho bảng `TrackLists`
--
ALTER TABLE `TrackLists`
  ADD CONSTRAINT `fk_TrackLists_CDs1` FOREIGN KEY (`media_id`) REFERENCES `CDs` (`media_id`),
  ADD CONSTRAINT `fk_TrackLists_Tracks1` FOREIGN KEY (`track_id`) REFERENCES `Tracks` (`track_id`);

--
-- Các ràng buộc cho bảng `Wards`
--
ALTER TABLE `Wards`
  ADD CONSTRAINT `fk_SubDistricts_Districts1` FOREIGN KEY (`district_id`) REFERENCES `Districts` (`district_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
