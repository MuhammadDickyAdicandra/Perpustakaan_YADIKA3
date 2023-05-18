-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Jan 2022 pada 07.58
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus_project`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `no_handphone` text NOT NULL,
  `nama` text NOT NULL,
  `tanggal_lahir` text NOT NULL,
  `email` text NOT NULL,
  `jenis_kelamin` text NOT NULL,
  `password` text NOT NULL,
  `aktivation_key` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`no_handphone`, `nama`, `tanggal_lahir`, `email`, `jenis_kelamin`, `password`, `aktivation_key`) VALUES
('087788298067', 'ADMIN', '02/11/1996', 'ADMIN@ADMIN.NET', 'Laki-Laki', 'ADMIN', '2E6D7I8F'),
('088225689280', 'Muhammad Dicky Adicandra', '3/08/2003', 'm.dicky@yahoo.co.id', 'Laki-Laki', '555', '1234');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_buku`
--

CREATE TABLE `data_buku` (
  `ISBN` text NOT NULL,
  `judul` text NOT NULL,
  `penerbit` text NOT NULL,
  `pengarang` text NOT NULL,
  `tahun_terbit` text NOT NULL,
  `kategori` text NOT NULL,
  `jumlah` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_buku`
--

INSERT INTO `data_buku` (`ISBN`, `judul`, `penerbit`, `pengarang`, `tahun_terbit`, `kategori`, `jumlah`) VALUES
('YK-000001', 'Tak Semuanya Buruk', 'Intera', 'Redaksi Intera', '2021', 'Novel', '15'),
('YK-000002', 'Biografi Jendral Sudirman', 'Cempaka Putih PT', 'Wahjudi Djaja', '2009', 'Biografi', '19'),
('YK-000003', 'Komik Sedekah', 'Phoenix Publishing', 'Arif Abinaufal', '2017', 'Komik', '25'),
('YK-000004', 'Belajar Jujur', 'Relasi Inti Media Groub', 'Sukini', '2017', 'Pendidikan', '17'),
('YK-000005', 'K.H Hasyim Asy\'ari', 'Ar-Ruzz Media', 'Muhammad Rifai', '2017', 'Biografi', '8'),
('YK-000006', 'Suka Duka Mahasiswa', 'Amongkarta', 'Raatih Puspita', '2019', 'Pendidikan', '5'),
('YK-000007', 'Secangkir Kopi', 'Garuda Mas Sejahtera', 'Jeanne R', '2018', 'Novel', '10'),
('YK-000008', 'BOBO-Polisi Cilik', 'Kompas Gramedia', '-', '2021', 'Majalah', '17'),
('YK-000009', 'Naruto VOL 72', 'Elex Media Komputindo', 'Masashi Kishimoto', '2016', 'Komik', '3'),
('YK-000010', 'The Seven Deadly Sins 30', 'Elex Media Komputindo', 'Nakaba Suzuki', '2018', 'Komik', '4'),
('YK-000011', 'Kimetsu No Yaiba VOL 8', 'VIZ Media LLC', 'Koyoharu Gotoge', '2019', 'Komik', '2'),
('YK-000012', 'Nobita Dan Pahlawan Bersayap', 'Elex Media Komputindo', 'Fujiko F. Fujio', '2001', 'Komik', '6'),
('YK-000013', 'Lima Sentimeter', 'Grasindo', 'Donny Dhirgantoro', '2017', 'Novel', '5'),
('YK-000014', 'Death Case 666', 'Lembar Langit Indonesia', 'Rudiyat', '2015', 'Novel', '6'),
('YK-000015', 'Menjemputmu ke sorga', 'Kyu Digital Books', 'Ahmad Misbahul Anam & Ummu Ahya\r\n', '2020', 'Novel', '7'),
('YK-000016', 'Amazing Guardian', 'Kepustakaan Populer Gramedia', 'Ran Orihara', '2013', 'Majalah', '13'),
('YK-000017', 'Akutansi Pengantar 1', 'Gava Media', 'Supardi', '2009', 'Pendidikan', '5'),
('YK-000018', 'Pengantar Teknologi Informasi', 'Andi Offset', 'Tata Sutabri', '2014', 'Pendidikan', '2'),
('YK-000019', 'Evaluasi Hasil Belajar', 'Pustaka Pelajar', 'Dr.Puswanto,M.Pd.', '2011', 'Pendidikan', '22'),
('YK-000020', 'Inovasi Pendidikan', 'Pustaka Setia', 'Prof.Dr.Sudarwan Danim', '2010', 'Pendidikan', '23'),
('YK-000021', 'Initial D VOL 35', 'Kodansha', 'Shuichi Shigeno', '2007', 'Komik', '23'),
('YK-000022', 'MF Ghost VOL 4', 'Kodansha', 'Shuichi Shigeno', '2017', 'Komik', '23'),
('YK-000023', 'Sailor Ace', 'Kodansha', 'Shuichi Shigeno', '2015', 'Komik', '15'),
('YK-000024', 'Jaka Sembung', 'Maranatha', 'Djair Warni', '1968', 'Komik', '23'),
('YK-000025', 'Playboy', 'Playboy Enterprise', 'Hugh Hafiner', '1995', 'Majalah', '3'),
('YK-000026', 'Tempo', 'Tempo Inti Media', 'Tim Tempo', '1971', 'Majalah', '10'),
('YK-000027', 'Gatra', 'Gatra', 'Pecahan Tim Tempo', '1994', 'Majalah', '13'),
('YK-000028', 'Rudy', 'Banteng Pustaka', 'Gina.s.noer', '2005', 'Biografi', '23'),
('YK-000029', 'Pak Harto', 'Gramedia', 'Mahpudi', '2011', 'Biografi', '23'),
('YK-000030', 'One Piece VOL 09 AIR MATA', 'Elex Media Komputindo', 'Eiichiro Oda', '1999', 'Komik', '7'),
('YK-000031', 'Mona Lisa\r\nA Life Discovered', 'Simon & Schuster', 'Dianne Hales', '2014', 'Biografi', '10'),
('YK-000032', 'SPECIAL MOMENT OF AL-FATAH ~ Edisi 14 Majalah el-Hujjah Temboro', 'El-Hujjah Magazine', 'El-Hujjah Crew', '-', 'Majalah', '25'),
('YK-000033', 'Mahasiswa Koplak', 'Pastel Books', 'Wisnu Maulana', '2018', 'Novel', '5'),
('YK-000034', 'Memahami Organisasi Pendidikan\r\nBudaya dan Reinventing, Organisasi Pendidikan', 'Prenada Media', 'Prof. Dr. H. Syaiful Sagala, S.Sos., M.Pd.', '2006', 'Pendidikan', '21'),
('YK-000035', 'Biografi Tokoh Sastra', 'PT Balai Pustaka / Persero', 'Ulinuha Rosyadi', '2012', 'Biografi', '18'),
('YK-000036', 'Putih Biru', 'Laksana', 'Arya Lawa Manuaba', '2019', 'Novel', '12'),
('YK-000037', 'Majalah Mata Air VOL 29', 'Ufuk Baru', '-', '-', 'Majalah', '29'),
('YK-000038', 'Studi Islam Kontemporer Perspektif Insider Outsider', 'IRCiSoD', 'M. Arfan Mu\'ammar, Abdul Wahid Hasan', '2017', 'Pendidikan', '20'),
('YK-000039', 'Kala (Part 1)', 'Gradien Mediatama', 'Hujanmimpi, Eleftheriawords n', '2017', 'Novel', '17'),
('YK-000040', 'Hirohito', 'SAGA Egmont', 'Lana Sokolaj', '2021', 'Biografi', '14'),
('YK-000041', 'Hiroshima', 'Knopf Doubleday Publishing Group', 'John Hersey', '1946', 'Biografi', '4');

-- --------------------------------------------------------

--
-- Struktur dari tabel `history_login`
--

CREATE TABLE `history_login` (
  `tanggal_terakhir_login` text NOT NULL,
  `nis` text NOT NULL,
  `nama` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `history_login`
--

INSERT INTO `history_login` (`tanggal_terakhir_login`, `nis`, `nama`) VALUES
('21/01/2022', '', 'Muammar Nasution'),
('24/01/2022', '123340', 'Muammar Nasution'),
('24/01/2022', '0124', 'Ahlan Nur Falah'),
('26/01/2022', '123340', 'Muammar Nasution'),
('26/01/2022', '123340', 'Muammar Nasution'),
('26/01/2022', '123340', 'Muammar Nasution');

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `nis` text NOT NULL,
  `nama` text NOT NULL,
  `kelas` text NOT NULL,
  `tanggal_lahir` text NOT NULL,
  `jenis_kelamin` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `tanggal_login` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`nis`, `nama`, `kelas`, `tanggal_lahir`, `jenis_kelamin`, `email`, `password`, `tanggal_login`) VALUES
('123340', 'Muammar Nasution', '12 TKR 2', '02/11/1996', 'Laki-Laki', 'Pak_Amar@gmail.com', '3333', ''),
('2222', 'MEMBER', 'X_TKJ3', '01/01/2001', 'Laki-Laki', 'MEMBER@MEMBER.NET', 'MEMBER', '26/01/2022');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `NIS` text NOT NULL,
  `nama` text NOT NULL,
  `kodepinjam` text NOT NULL,
  `ISBN` text NOT NULL,
  `judul` text NOT NULL,
  `tanggalpin` text NOT NULL,
  `tanggalkem` text NOT NULL,
  `nohp` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`NIS`, `nama`, `kodepinjam`, `ISBN`, `judul`, `tanggalpin`, `tanggalkem`, `nohp`) VALUES
('2222', 'MEMBER', 'P-0001', 'YK-000007', 'Secangkir Kopi', '26/01/2022', '27/01/2022', '087788298067'),
('2222', 'MEMBER', 'P0000', 'YK-000008', 'BOBO-Polisi Cilik', '27/01/2022', '28/01/2022', '087788298067'),
('2222', 'MEMBER', 'P0001', 'YK-000009', 'Naruto VOL 72', '28/01/2022', '29/01/2022', '087788298067'),
('2222', 'MEMBER', 'P0002', 'YK-0000012', 'Tak Semuanya Buruk', '27/01/2022', '28/01/2022', '087788298067');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `kodepinjam` text NOT NULL,
  `NIS` text NOT NULL,
  `nama` text NOT NULL,
  `ISBN` text NOT NULL,
  `judul` text NOT NULL,
  `nohp` text NOT NULL,
  `tanggalpin` text NOT NULL,
  `tanggalkem` text NOT NULL,
  `denda` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengembalian`
--

INSERT INTO `pengembalian` (`kodepinjam`, `NIS`, `nama`, `ISBN`, `judul`, `nohp`, `tanggalpin`, `tanggalkem`, `denda`) VALUES
('P0001', '2222', 'MEMBER', 'YK-000009', 'Naruto VOL 72', '087788298067', '28/01/2022', '29/01/2022', '0'),
('P0002', '2222', 'MEMBER', 'YK-0000012', 'Tak Semuanya Buruk', '087788298067', '27/01/2022', '28/01/2022', '0'),
('P0002', '2222', 'MEMBER', 'YK-0000012', 'Tak Semuanya Buruk', '087788298067', '27/01/2022', '28/01/2022', '0'),
('P0002', '2222', 'MEMBER', 'YK-0000012', 'Tak Semuanya Buruk', '087788298067', '27/01/2022', '28/01/2022', '0'),
('P0002', '2222', 'MEMBER', 'YK-0000012', 'Tak Semuanya Buruk', '087788298067', '27/01/2022', '28/01/2022', '0'),
('p0002', '2222', 'MEMBER', 'YK-0000012', 'Tak Semuanya Buruk', '087788298067', '27/01/2022', '28/01/2022', '0'),
('p0002', '2222', 'MEMBER', 'YK-0000012', 'Tak Semuanya Buruk', '087788298067', '27/01/2022', '28/01/2022', '200'),
('P0001', '2222', 'MEMBER', 'YK-000009', 'Naruto VOL 72', '087788298067', '28/01/2022', '29/01/2022', ''),
('P0001', '2222', 'MEMBER', 'YK-000009', 'Naruto VOL 72', '087788298067', '28/01/2022', '29/01/2022', '2000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekomendasi`
--

CREATE TABLE `rekomendasi` (
  `Rekomendasi1` text NOT NULL,
  `Rekomendasi2` text NOT NULL,
  `Rekomendasi3` text NOT NULL,
  `Rekomendasi4` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `rekomendasi`
--

INSERT INTO `rekomendasi` (`Rekomendasi1`, `Rekomendasi2`, `Rekomendasi3`, `Rekomendasi4`) VALUES
('YK-000004', 'YK-000024', 'YK-000032', 'YK-000037');

-- --------------------------------------------------------

--
-- Struktur dari tabel `trending`
--

CREATE TABLE `trending` (
  `Sedang_Trending1` text NOT NULL,
  `Sedang_Trending2` text NOT NULL,
  `Sedang_Trending3` text NOT NULL,
  `Sedang_Trending4` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `trending`
--

INSERT INTO `trending` (`Sedang_Trending1`, `Sedang_Trending2`, `Sedang_Trending3`, `Sedang_Trending4`) VALUES
('YK-000009', 'YK-000010', 'YK-000018', 'YK-000013');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`no_handphone`(12));

--
-- Indeks untuk tabel `data_buku`
--
ALTER TABLE `data_buku`
  ADD PRIMARY KEY (`ISBN`(17));

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`nis`(8));

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`kodepinjam`(17));
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
