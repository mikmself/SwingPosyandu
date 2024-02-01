-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Des 2023 pada 11.56
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `posyandu`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `bayi`
--

CREATE TABLE `bayi` (
  `id_bayi` varchar(25) NOT NULL,
  `nama_bayi` varchar(50) DEFAULT NULL,
  `nama_ayah` varchar(50) DEFAULT NULL,
  `nama_ibu` varchar(50) DEFAULT NULL,
  `tempat_lahir` varchar(25) DEFAULT NULL,
  `jenis_kelamin` varchar(25) DEFAULT NULL,
  `anak_ke` int(11) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `bayi`
--

INSERT INTO `bayi` (`id_bayi`, `nama_bayi`, `nama_ayah`, `nama_ibu`, `tempat_lahir`, `jenis_kelamin`, `anak_ke`, `alamat`) VALUES
('1', 'bimo', 'Contoh Ayah Bayi 1', 'Contoh Ibu Bayi 1', 'Banyumas', 'Laki Laki', 1, 'Banyumas'),
('3', 'Contoh Bayi 3', 'Contoh Ayah Bayi 3', 'Contoh Ibu Bayi 3', 'Banyumas', 'Laki Laki', 3, 'Banyumas'),
('4', 'Dinda', 'boby', 'Indah', 'Banyumas', 'Perempuan', 5, 'Banyumas'),
('5', 'Bani', 'Toni', 'Dina', 'Banyumas', 'Laki laki', 1, 'Banyumas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `bidan`
--

CREATE TABLE `bidan` (
  `id_bidan` varchar(25) NOT NULL,
  `nama_bidan` varchar(50) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(25) DEFAULT NULL,
  `no_telp` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `bidan`
--

INSERT INTO `bidan` (`id_bidan`, `nama_bidan`, `tanggal_lahir`, `alamat`, `jenis_kelamin`, `no_telp`) VALUES
('1', 'Contoh Bidan 1', '2023-12-17', 'Banyumas', 'Laki Laki', '081229473829'),
('2', 'Contoh Bidan 2', '2023-12-17', 'Banyumas', 'Laki Laki', '081229473821'),
('4', 'Bobi', '2023-12-19', 'Banyumas', 'Laki Laki', '089877223888'),
('5', 'Bima', '1999-12-14', 'Jakarta', 'Laki-laki', '089765432123'),
('6', 'Dina', '1999-12-20', 'Jakarta', 'Perempuan', '089538302221'),
('7', 'Tika', '1999-12-27', 'Jakarta', 'Perempuan', '089538302299089');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kader`
--

CREATE TABLE `kader` (
  `id_kader` varchar(25) NOT NULL,
  `nama_kader` varchar(50) DEFAULT NULL,
  `tempat` varchar(25) DEFAULT NULL,
  `jenis_kelamin` varchar(25) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `no_telp` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kader`
--

INSERT INTO `kader` (`id_kader`, `nama_kader`, `tempat`, `jenis_kelamin`, `alamat`, `no_telp`) VALUES
('1', 'Sila', 'Banyumas', 'Laki Laki', 'Banyumas', '081229473829'),
('3', 'Contoh Kader 3', 'Banyumas', 'Laki Laki', 'Banyumas', '081229473823'),
('4', 'Sinta', 'Jakarta', 'Perempuan', 'Banyumas', '089653211123'),
('5', 'toni', 'banyumas', 'laki-laki', 'banyumas', '0889662222'),
('6', 'Dila', 'Banyumas', 'Perempuan', 'banyumas', '089765456374');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelayanan_bayi`
--

CREATE TABLE `pelayanan_bayi` (
  `id_pelayanan` varchar(50) NOT NULL,
  `id_bayi` varchar(25) DEFAULT NULL,
  `id_kader` varchar(25) DEFAULT NULL,
  `id_bidan` varchar(25) DEFAULT NULL,
  `tanggal_pelayanan` date DEFAULT NULL,
  `berat_bayi` varchar(25) DEFAULT NULL,
  `tinggi_bayi` varchar(25) DEFAULT NULL,
  `jenis_imunisasi` varchar(25) DEFAULT NULL,
  `jenis_vitamin` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pelayanan_bayi`
--

INSERT INTO `pelayanan_bayi` (`id_pelayanan`, `id_bayi`, `id_kader`, `id_bidan`, `tanggal_pelayanan`, `berat_bayi`, `tinggi_bayi`, `jenis_imunisasi`, `jenis_vitamin`) VALUES
('1', '5', '5', '7', '2023-12-27', '20', '100', 'Campak', 'Vitamin C'),
('2', '4', '4', '6', '2023-12-26', '21', '110', 'Corona', 'Corona'),
('3', '1', '4', '4', '2023-12-19', '25', '120', 'Booster', 'Vitamin A');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `email` varchar(25) NOT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`email`, `password`) VALUES
('audy@gmail.com', 'admin12'),
('user', 'user12');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `bayi`
--
ALTER TABLE `bayi`
  ADD PRIMARY KEY (`id_bayi`);

--
-- Indeks untuk tabel `bidan`
--
ALTER TABLE `bidan`
  ADD PRIMARY KEY (`id_bidan`);

--
-- Indeks untuk tabel `kader`
--
ALTER TABLE `kader`
  ADD PRIMARY KEY (`id_kader`);

--
-- Indeks untuk tabel `pelayanan_bayi`
--
ALTER TABLE `pelayanan_bayi`
  ADD PRIMARY KEY (`id_pelayanan`),
  ADD KEY `fk_bayi` (`id_bayi`),
  ADD KEY `fk_kader` (`id_kader`),
  ADD KEY `fk_bidan` (`id_bidan`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `pelayanan_bayi`
--
ALTER TABLE `pelayanan_bayi`
  ADD CONSTRAINT `fk_bayi` FOREIGN KEY (`id_bayi`) REFERENCES `bayi` (`id_bayi`),
  ADD CONSTRAINT `fk_bidan` FOREIGN KEY (`id_bidan`) REFERENCES `bidan` (`id_bidan`),
  ADD CONSTRAINT `fk_kader` FOREIGN KEY (`id_kader`) REFERENCES `kader` (`id_kader`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
