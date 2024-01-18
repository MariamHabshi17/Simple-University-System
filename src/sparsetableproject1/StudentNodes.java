package sparsetableproject1;
import java.lang.System;
public class StudentNodes extends SparseTableProject1{
 static StudentNodes callmethod =new StudentNodes();
   class sNode {

        sNode next;
        csNode linkWithCourse;
        int id;

        sNode() {
        }

        sNode(int el) {
            id = el;
            next = null;
        }

    }
    sNode head, tail;
    
    class cNode {

        cNode next;
        csNode linkWithStudent;
        String course;

        cNode() {
        }

        cNode(String c) {
            course = c;
            next = null;
        }

    }
    cNode courseHead , courseTail;

    static class csNode {

        int id;
        String course;
        csNode nextRight;
        csNode nextDown;
        csNode up;
        sNode firstUp;
        csNode() {
        }

        csNode(int idd, String c) {
            id = idd;
            course = c;

        }

    }
   // csNode csHead, cTail, sTail;

    
    int length = 0;

    public void addStudent(int el) {
        if ((head == null) && (tail == null)) {
            head = tail = new sNode(el);
        } else {
            tail.next = new sNode(el);
            tail = tail.next;
        }
        length++;
    }
    
    public void addCourseInSystem(String c) {
        if ((courseHead == null) && (courseTail == null)) {
            courseHead = courseTail = new cNode(c);
        } else {
            courseTail.next = new cNode(c);
            courseTail = courseTail.next;
        }
    }
    
    //need edits
//    public void deleteStudent(int el) {
//        if (length != 0) {
//            length--;
//            if (head == tail && el == head.id) {
//                head = tail = null;
//            } else if (el == head.id) {
//                head = head.next;
//            } else {
//                sNode temp, pred;
//                for (pred = head, temp = head.next; (temp != null) && !(temp.id == el); pred = pred.next, temp = temp.next);
//                if (temp != null) {
//                    pred.next = temp.next;
//                    if (temp == tail) {
//                        tail = pred;
//                    }
//
//                }
//            }
//        }
//    }
    public sNode checkId(int idd){
        sNode temp;
            for(temp=head ; temp!=null && !(temp.id==idd) ; temp=temp.next);
            return (temp);
            
    }
    
    public boolean isFirstCourse(int idd){ //firsr course for student
        sNode myTemp;   
        for(myTemp = head ; myTemp.id!=idd ; myTemp=myTemp.next);
        return (myTemp.id==idd && myTemp.linkWithCourse==null);
    }
    
    public cNode isCourseExist(String c){ //is corse exist in system
            cNode temp;
            for(temp=courseHead ; (temp!=null)&& !(temp.course.equalsIgnoreCase(c)) ; temp=temp.next);
            return (temp);
    }
    
    public void addCourse(int idd, String c){
        if(isCourseExist(c)!=null && isCourseExist(c).course.equals(c)){ //check if course is exist in system
        if(checkId(idd)!=null){  //check student is in system
            sNode tempStudent  = checkId(idd);
            cNode tempCourse = isCourseExist(c);
            
            if (isFirstCourse(idd)){ //is first course for this student
                csNode newNode = new csNode(idd, c);
                tempStudent.linkWithCourse = newNode;
                newNode.firstUp = tempStudent;
                newNode.nextDown=null;
                if(tempCourse.linkWithStudent==null){ //this course was first one added to any student
                    tempCourse.linkWithStudent = newNode;
                    newNode.nextRight=null;
                }else{
                    csNode tempNode = tempCourse.linkWithStudent; // assign first course to temp node as temp head
                    while(tempNode.nextRight!=null){
                        tempNode=tempNode.nextRight;
                    }
                    tempNode.nextRight=newNode;
                    newNode.nextRight=null;
                } 
            }else{ //there are a courses for this student
                csNode newNode = new csNode(idd, c);
                csNode temp = tempStudent.linkWithCourse;
                while(temp.nextDown!=null){
                    temp = temp.nextDown;
                }
                temp.nextDown=newNode;
                newNode.up = temp;
                newNode.nextDown=null;
                
                if(tempCourse.linkWithStudent==null){ //this course was first one added to any student
                    tempCourse.linkWithStudent = newNode;
                    newNode.nextRight=null;
                }else{
                    csNode tempNode = tempCourse.linkWithStudent; // assign first course to temp node as temp head
                    while(tempNode.nextRight!=null){
                        tempNode=tempNode.nextRight;
                    }
                    tempNode.nextRight=newNode;
                    newNode.nextRight=null;
                }

            }
        }else{
            System.out.println("id not");} 
        }else{
            System.out.println("Course is not exist");
        }
    }
    
public void deleteCourseFromSystem(String c){
        if(isCourseExist(c)!=null){ //if course exist 
            cNode tempCourse = isCourseExist(c);
            cNode temp = courseHead;
            while(temp.next!=tempCourse && temp!=tempCourse){
                temp=temp.next;
            }
            
            //then temp = prev course that i wanna delete
           if(tempCourse.linkWithStudent==null){ //no students assigned to this course
               if(tempCourse.next!=null)
                  temp.next=tempCourse.next;
               else{
                  courseTail=temp;
                  tempCourse=null;
               }
           }else{ //there is students assigned to this course
               csNode csTemp = tempCourse.linkWithStudent; // first student assigned this course
               temp.linkWithStudent=null;
               while(csTemp!=null){
                   if(csTemp.firstUp!=null){ //this course was first course to this student
                       csTemp.firstUp.linkWithCourse =csTemp.nextDown;
                       if(csTemp.nextDown!=null){
                       csTemp.nextDown.firstUp = csTemp.firstUp;
                       }else{
                           csTemp.firstUp.linkWithCourse=null;
                       }
                       csTemp.up=null;
                       csTemp.nextDown=null;
                   }else{ //this course is between other courses
                       csTemp.up.nextDown = csTemp.nextDown;
                       if(csTemp.nextDown!=null){
                           csTemp.nextDown.up = csTemp.up;
                       }else{
                           csTemp.up.nextDown=null;
                       }
                       
                       csTemp.up=null;
                       csTemp.nextDown=null;
                   }
                   csTemp = csTemp.nextRight;
               }
               
               
               if(tempCourse.next!=null){
                  temp.next=tempCourse.next;
                  if(temp==tempCourse){
                      courseHead=temp.next;
                  }
               }else{
                  courseTail=temp; 
                  if(temp==tempCourse){
                      courseHead=temp.next;
                  }
           }}
        }else{ 
            System.out.println("course is not exist");
        }
    }
    
    public void deleteCourseFromStudent(int idd , String c){
         if(checkId(idd)!=null){ //check student is in system
            if(isCourseExist(c)!=null && isCourseExist(c).course.equals(c)){  //check if course is exist in system
                sNode tempStudent  = checkId(idd);
                cNode tempCourse = isCourseExist(c);
                csNode myNode ,prevNode;
//                prevNode = tempCourse.linkWithStudent;
  //              myNode = prevNode.nextRight;
                 for(prevNode = tempCourse.linkWithStudent , myNode=prevNode.nextRight ; ( (prevNode.id!=idd) && (prevNode.nextRight!=null)) && (myNode.id!=idd ) ; myNode = myNode.nextRight , prevNode= prevNode.nextRight) ;             
                 
                if (prevNode.firstUp == tempStudent && tempCourse.linkWithStudent == prevNode && prevNode.id == idd) {
                    tempCourse.linkWithStudent = myNode;
                    tempStudent.linkWithCourse = prevNode.nextDown;
                    if(prevNode.nextDown!=null){
                    prevNode.nextDown.firstUp = tempStudent;
                    prevNode.firstUp = null;
                    prevNode.nextDown.up = null;
                    }else{
                        prevNode.firstUp=null;
                    }
                } else if (myNode.id == idd && myNode.firstUp == tempStudent) {
                    prevNode.nextRight = myNode.nextRight;
                    if(myNode.nextDown==null){}else{
                        myNode.nextDown.firstUp = tempStudent;
                     }
                    tempStudent.linkWithCourse = myNode.nextDown;
                    myNode.firstUp = null;
                    //myNode.nextDown.up = null;
                } else if (prevNode == tempCourse.linkWithStudent && prevNode.id == idd && prevNode.firstUp == null) {
                    tempCourse.linkWithStudent = myNode;
                    prevNode.up.nextDown = prevNode.nextDown;
                    if(prevNode.nextDown !=null){
                    prevNode.nextDown.up = prevNode.up;
                    prevNode.up =prevNode.nextDown= null;
                    }else{
                    prevNode.up =prevNode.nextDown= null; 
                    }
                } else {
                    prevNode.nextRight = myNode.nextRight;
                    myNode.up.nextDown = myNode.nextDown;
                    if(myNode.nextDown!=null){
                    myNode.nextDown.up = myNode.up;
                    myNode.up = myNode.nextDown = myNode.nextDown = null;
                    }else{
                    myNode.up = myNode.nextDown = myNode.nextDown = null;
                    }
                }
            } else {
                System.out.println("this course is not exist");
            }
        } else {
            System.out.println("Student is not exist");
        }
    
    }
    
    public void printStudentCourses(int idd){
        if(checkId(idd)!=null){
            csNode tempNode = checkId(idd).linkWithCourse;
            if(tempNode!=null){
            while(tempNode!=null){
                System.out.print(tempNode.course+" ");
                tempNode= tempNode.nextDown;
            }}else{
                System.out.println("s no courses");
            }
        
        }else{
            System.out.println("id not found");
        }
    }
    
    public void printCoursStudents(String c){
        if(isCourseExist(c)!=null){
            csNode tempNode = isCourseExist(c).linkWithStudent;
            if(tempNode!=null){
                while(tempNode!=null){
                System.out.print(tempNode.id+" ");
                tempNode= tempNode.nextRight;
            }
            }else{
                System.out.println("this course has no students");
            }
        
        }else{
            System.out.println("this course is not exist");
        }
    }}
