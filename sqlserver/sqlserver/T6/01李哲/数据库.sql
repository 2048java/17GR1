USE [master]
GO
/****** Object:  Database [ Anyan]    Script Date: 2017/12/15 11:49:25 ******/
CREATE DATABASE [ Anyan]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N' Anyan', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\ Anyan.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N' Anyan_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\ Anyan_log.ldf' , SIZE = 2048KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ Anyan] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ Anyan].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ Anyan] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ Anyan] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ Anyan] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ Anyan] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ Anyan] SET ARITHABORT OFF 
GO
ALTER DATABASE [ Anyan] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ Anyan] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ Anyan] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ Anyan] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ Anyan] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ Anyan] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ Anyan] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ Anyan] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ Anyan] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ Anyan] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ Anyan] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ Anyan] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ Anyan] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ Anyan] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ Anyan] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ Anyan] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ Anyan] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ Anyan] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ Anyan] SET  MULTI_USER 
GO
ALTER DATABASE [ Anyan] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ Anyan] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ Anyan] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ Anyan] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [ Anyan] SET DELAYED_DURABILITY = DISABLED 
GO
USE [ Anyan]
GO
/****** Object:  Table [dbo].[course]    Script Date: 2017/12/15 11:49:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[course](
	[cid] [int] NOT NULL,
	[cnam] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_course] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[score]    Script Date: 2017/12/15 11:49:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[score](
	[scid] [int] NOT NULL,
	[sid] [int] NOT NULL,
	[cid] [int] NOT NULL,
	[score] [decimal](6, 2) NOT NULL,
 CONSTRAINT [PK_score] PRIMARY KEY CLUSTERED 
(
	[scid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[student]    Script Date: 2017/12/15 11:49:25 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[student](
	[sid] [int] NOT NULL,
	[snam] [nvarchar](20) NOT NULL,
	[sex] [nvarchar](1) NOT NULL,
	[birth] [varchar](30) NOT NULL,
 CONSTRAINT [PK_student] PRIMARY KEY CLUSTERED 
(
	[sid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[course] ([cid], [cnam]) VALUES (1, N't1')
INSERT [dbo].[course] ([cid], [cnam]) VALUES (2, N't2')
INSERT [dbo].[course] ([cid], [cnam]) VALUES (3, N't3')
INSERT [dbo].[course] ([cid], [cnam]) VALUES (4, N't4')
INSERT [dbo].[course] ([cid], [cnam]) VALUES (5, N't5')
INSERT [dbo].[course] ([cid], [cnam]) VALUES (6, N't6')
INSERT [dbo].[score] ([scid], [sid], [cid], [score]) VALUES (1, 1, 1, CAST(78.00 AS Decimal(6, 2)))
INSERT [dbo].[score] ([scid], [sid], [cid], [score]) VALUES (2, 2, 2, CAST(98.00 AS Decimal(6, 2)))
INSERT [dbo].[score] ([scid], [sid], [cid], [score]) VALUES (3, 3, 3, CAST(76.00 AS Decimal(6, 2)))
INSERT [dbo].[score] ([scid], [sid], [cid], [score]) VALUES (4, 4, 4, CAST(77.00 AS Decimal(6, 2)))
INSERT [dbo].[score] ([scid], [sid], [cid], [score]) VALUES (5, 5, 5, CAST(66.00 AS Decimal(6, 2)))
INSERT [dbo].[student] ([sid], [snam], [sex], [birth]) VALUES (1, N'l1', N'n', N'19')
INSERT [dbo].[student] ([sid], [snam], [sex], [birth]) VALUES (2, N'l2', N'm', N'19')
INSERT [dbo].[student] ([sid], [snam], [sex], [birth]) VALUES (3, N'l3', N'm', N'13')
INSERT [dbo].[student] ([sid], [snam], [sex], [birth]) VALUES (4, N'l4', N'h', N'20')
INSERT [dbo].[student] ([sid], [snam], [sex], [birth]) VALUES (5, N'l5', N'm', N'22')
ALTER TABLE [dbo].[score]  WITH CHECK ADD  CONSTRAINT [FK_score_course] FOREIGN KEY([cid])
REFERENCES [dbo].[course] ([cid])
GO
ALTER TABLE [dbo].[score] CHECK CONSTRAINT [FK_score_course]
GO
ALTER TABLE [dbo].[score]  WITH CHECK ADD  CONSTRAINT [FK_score_student] FOREIGN KEY([sid])
REFERENCES [dbo].[student] ([sid])
GO
ALTER TABLE [dbo].[score] CHECK CONSTRAINT [FK_score_student]
GO
USE [master]
GO
ALTER DATABASE [ Anyan] SET  READ_WRITE 
GO
