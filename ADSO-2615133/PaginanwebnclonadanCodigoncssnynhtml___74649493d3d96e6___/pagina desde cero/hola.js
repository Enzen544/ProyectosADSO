function changeIconColor(element) {
    var icons = document.querySelectorAll('.icons img');
    for (var i = 0; i < icons.length; i++) {
      icons[i].classList.remove('selected');
    }
    element.classList.add('selected');
  }
  
  