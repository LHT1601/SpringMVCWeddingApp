/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/* search form script */

document.querySelector('#search-icon').onclick = () =>{
    document.querySelector('#search-form').classList.toggle('active');
}
  
document.querySelector('#close').onclick = () =>{
    document.querySelector('#search-form').classList.remove('active');
}


/* home advertisements script */

var images =[ "images/home-img-1.png" , "images/home-img-3.png" , "images/home-img-2.png" ,  "images/home-img-3.png" ];
var num = 0;
function next(){
    let imgs = document.getElementById("imgs");
    num++;
    if(num >= images.length) {
        num = 0;
    }
    imgs.src = images[num];
}
function prev(){
    let imgs = document.getElementById("imgs");
    num--;
    if(num < 0) {
        num = images.length-1;
    }
    imgs.src = images[num];
}

setInterval(function(){
    next();
},1600);

/* move window */

let menu = document.querySelector('#menu-bars');
let navbar = document.querySelector('.navbar');

let section = document.querySelectorAll('section');
let navLinks = document.querySelectorAll('header .navbar a');

window.onscroll = () =>{

  menu.classList.remove('fa-times');
  navbar.classList.remove('active');

  section.forEach(sec =>{

    let top = window.scrollY;
    let height = sec.offsetHeight;
    let offset = sec.offsetTop - 150;
    let id = sec.getAttribute('id');

    if(top >= offset && top < offset + height){
      navLinks.forEach(links =>{
        links.classList.remove('active');
        document.querySelector('header .navbar a[href*='+id+']').classList.add('active');
      });
    };

  });

}









function loader(){
    document.querySelector('.loader-container').classList.add('fade-out');
}

function fadeOut(){
    setInterval(loader, 3000);
}
  
window.onload = fadeOut;