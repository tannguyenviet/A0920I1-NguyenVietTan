-- 1 Thêm dữ liệu
-- 2
	select IDNhanVien,HoTen from nhanvien where 
    HoTen like 'H%' or 'T%' or 'K%';
-- 3

	select IDKhachHang,HoTen,(Year(now())-Year(NgaySinh)) as 'Tuoi' from Khachhang 
    where Tuoi>18 and Tuoi<50;  
    
	select IDKhachHang,HoTen,(Year(now())-Year(NgaySinh)),diachi  from Khachhang 
    where ((Year(now())-Year(NgaySinh))>18 and (Year(now())-Year(NgaySinh))<50)and diachi = 'DaNang' or 'QuangTri' ;
    
    select IDKhachhang,Hoten as ht from khachhang;  
-- 4
	select hd.IDKhachHang,HoTen,IDLoaiKhach, count(hd.IDKhachHang) as solan from hopdong as hd
    join khachhang as kh on kh.IdKhachhang =hd.IDKhachHang
    where idLoaikhach = 1
    group by IDKhachhang;
-- 5
	select kh.idkhachhang,hoten,tenloaikhach,hd.idhopdong,tendichvu,ngaylamhopdong,ngayketthuc,(chiphithue+soluong*gia) as tongtien from khachhang as kh
    left join Hopdong as hd on kh.idkhachhang = hd.idkhachhang 
    left join loaikhach as lk on lk.IDLoaiKhach = kh.IDLoaiKhach
    left join dichvu    as dv on dv.IDDichVu = hd.IDDichVu
    left join hopdongchitiet as hdct on hdct.IDHopDong = hd.IDHopDong
    left join dichvudikem as dvdk on dvdk.IDDichVuDiKem = hdct.IDDichVuDiKem;
    
    
   
   
   
    select kh.idKhachhang,hoten,idhopdong from hopdong as hd
    right join khachhang as kh on hd.idkhachhang = kh.idkhachhang
    
-- 6	
-- 7
-- 8 
-- 9
-- 10
-- 11 
-- 12
-- 13
-- 14
-- 15
-- 16
-- 17
-- 18 
-- 19
-- 20