@service
public class StudentServiceImplementation implements StudentService{
@Autowired
StudentRepository repo;
    public Student createData(Student stu){
        return repo.save(stu);
    }
    public List<Student> fetchRecord(){
        return repo.findAll();
    }
}