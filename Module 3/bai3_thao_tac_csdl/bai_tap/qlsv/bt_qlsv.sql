use quanlysinhvien;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select *from student where student.StudentName like "h%";

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select *from subject where Credit between 3 and 5;


-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates =0;
update student set classId =2 where studentName ='Hung';
set sql_safe_updates =1;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select distinct S.StudentName , Sub.SubName , M.Mark from student S join mark M on  S.StudentId=M.StudentId join subject Sub on M.SubId=Sub.SubId where Mark order by Mark desc;

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *from Class where Class.StartDate  #12# ;