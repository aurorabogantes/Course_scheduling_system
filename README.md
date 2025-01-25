# Course_scheduling_system 

## Description  
The **Course Scheduling System** is an application designed to streamline the management of teaching staff schedules at training centers. It provides tools to manage teachers, courses, and degree programs and create and modify schedules efficiently.  

### Main Features  
- **User and Role Management**: Access control for administrators and assistants with secure login.  
- **CRUD Operations for Teachers, Courses, and Degrees**: Allows for the creation, editing, deletion, and consultation of information.  
- **Schedule Assignment**: Assigns courses to teachers, ensuring they do not exceed the maximum allowed limit of 6 courses.  
- **Schedule Modifications**: Allows changes due to meetings, sick leave, or other events, with all modifications logged in a history.  
- **Report Generation**: Displays a detailed summary of assigned courses, total hours, credits, and associated degree program for each teacher.  
- **Data Persistence**: Stores information in local files to ensure data consistency.  

### Requirements  
1. **Login**:  
   - First screen shown upon opening the application.  
   - Allows up to 3 login attempts.  

2. **Role Control**:  
   - User management with administrator and assistant roles.  

3. **MDI Interface**:  
   - Navigation through windows in an intuitive user interface.  

4. **Main Menu**:  
   - Quick access to the core functionalities of the application.  

5. **Reports**:  
   - Query assigned courses, total hours, credits, and the associated degree for the entered teacher code.  

6. **CRUD Screens**:  
   - **Teachers**: Manage ID, full name, phone, address, and specialty.  
   - **Courses**: Manage course code, name, credits, hours, max students, and associated degree.  
   - **Degrees**: Manage degree code and name.  

7. **Create Schedule Screen**:  
   - Assign courses to teachers, validating that the 6-course limit is not exceeded.  

8. **Data Storage**:  
   - File-based persistence for user, teacher, center, module, and program data.   

### Installation  
1. Clone the repository:  
   ```bash
   git clone https://github.com/aurorabogantes/Course_scheduling_system.git
