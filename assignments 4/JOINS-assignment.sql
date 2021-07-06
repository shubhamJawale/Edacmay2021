use lab;
select * from countries;
select * from departments;	
select * from employees;
select * from job_history;
select * from jobs;
select * from locations;
select * from regions;
#1
# Write a query to find the addresses (location_id, street_address, city, state_province, country_name) of all the departments.
SELECT 
    locations.location_id,
    street_address,
    city,
    state_province,
    Country_name
FROM
    locations,
    departments,
    countries
WHERE
    locations.LOCATION_ID = departments.LOCATION_ID
        AND countries.country_id = locations.country_id
		#group by LOCATION_ID
        order by Country_name;

#2
#Write a query to find the name (first_name, last name), department ID and name of all the employees.
select first_name, last_name, departments.department_id, department_name from departments, employees where departments.DEPARTMENT_ID = employees.department_id order by department_id;

#3
#Write a query to find the name (first_name, last_name), job, department ID and name of the employees who works in London.
SELECT 
    first_name, last_name, job_title, departments.department_id,department_name, city
FROM
    employees,
    departments,
    locations,
    jobs
WHERE
	employees.job_id = jobs.job_id and
     departments.location_id = locations.location_id and
    employees.department_id = departments.department_id 
      and city ='London' ;
        
        

        
   ##
   #4
   #Write a query to find the employee id, name (last_name) along with their manager_id and name (last_name).
 SELECT 
    mgr.last_name AS Emp_name,
    mgr.employee_id,
    emp.last_name AS mgr_name,
    emp.employee_id AS Mgr_id
FROM
    employees emp,
    employees mgr
WHERE
    mgr.MANAGER_ID = emp.employee_ID ;
   select manager_id from employees ;
 
	##
	#5
	#Write a query to find the name (first_name, last_name) and hire date of the employees who was hired after 'Jones.
	select first_name, last_name from employees where hire_date>(select hire_date from employees where  last_name = 'Jones');
	#join
	select comp.first_name, comp.last_name from employees Sort, employees comp where comp.hire_date > sort.hire_date and sort.last_name = 'Jones';
##
#6
#Write a query to get the department name and number of employees in the department.
select department_name,count(employees.Employee_id) from employees, departments where  employees.department_id = departments.department_id group by department_name;

#7
#Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department 90.
select employees.employee_id, job_title, (end_date - Start_date) as days from employees, jobs, job_history
 where   employees.Department_id = job_history.Department_id and employees.job_id = jobs.job_ID and employees.Department_id = 90 ;

##########REVIEW#####

SELECT 
    employees.employee_id,
    job_title,
    (end_date - start_date),
    employees.department_id
FROM
    employees,
    jobs,
    job_history
WHERE
    employees.DEPARTMENT_ID = job_history.DEPARTMENT_ID
        AND employees.job_id = jobs.job_id
        AND employees.department_id = 90;
##
#8 Write a query to display the department ID and name and first name of manager.
	select departments.department_id,  department_name, first_name, last_name from departments, employees where departments.manager_id = employees.employee_id;
 ##
 #9 	Write a query to display the department name, manager name, and city.
 
select department_name, first_name, last_name, city from departments, employees, locations where departments.manager_id = employees.employee_id and departments.location_id = locations.location_id;

##
#10
  # Write a query to display the job title and average salary of employees.
  
  select job_title, avg(salary) from jobs, employees where employees.job_id = jobs.job_id group by employees.job_id;
  
  ##
  #11
  ##     Write a query to display job title, employee name, and the difference between salary of the employee and minimum salary for the job.
  select job_title, first_name, last_name, (salary-min_salary) from employees, jobs, job_history where jobs.job_id=job_history.job_id and employees.job_id = jobs.job_id;

##
#12
##Write a query to display the job history that were done by any employee who is currently drawing more than 10000 of salary.

select first_name, employees.job_id, job_history.*
from employees, job_history
where employees.employee_id = job_history.employee_id;


##
#13
##Write a query to display department name, name (first_name, last_name), hire date, salary of the manager for all managers whose experience is more than 15 years.

select department_name, first_name, last_name, hire_date, salary
from departments, employees
where departments.department_id = employees.department_id
and employees.employee_id =  departments.manager_id
and (sysdate()-hire_date)>(15*365);









 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
####EXTRA REFERENCE QUERIES ############
##
##7
select employees.employee_id,job_title, (end_date-start_date)
from employees, jobs,job_history
where employees.DEPARTMENT_ID=job_history.DEPARTMENT_ID 
and jobs.JOB_ID=job_history.JOB_ID
and employees.DEPARTMENT_ID=90;

##q4 
   #select  MGR.LAST_NAME,MGR.employee_id ,EMP.EMPLOYEE_ID as Manager_id,EMP.last_name
#from employees as EMP,employees as MGR 
#where EMP.Employee_id=MGR.Manager_id;

#5 wrong
#select a.FIRST_NAME,a.LAST_NAME,a.HIRE_DATE from employees a,employees b
#where b.HIRE_DATE > (a.HIRE_DATE=b.HIRE_DATE and b.LAST_NAME='Jones'); 

##extra
#        SELECT Departments.LOCATION_ID, street_address, city, state_province, country_name 
#where countries.COUNTRY_ID = Locations.COUNTRY_ID and Departments.LOCATION_ID = Locations.LOCATION_ID group by LOCATION_ID;
##11
select job_title,first_name,(salary-MIN_SALARY)
from employees,jobs
where jobs.job_id=employees.job_id
group by job_title;

##q3
#SELECT 
 #   first_name, last_name, job_title, departments.department_id, city
#FROM
 #   employees,
 #   departments,
 #   locations, jobs
#WHERE
	
   # (employees.department_id = departments.department_id 
   #     AND departments.location_id = locations.location_id  and  employees.job_id = jobs.job_id) and city = 'London' ;