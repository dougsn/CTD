ScrollReveal({
    reset: false /*Caso queira que a animação do scroll fique tanto na descida quanto na subida, trocar para true */,
    distance: '60px',
    duration: 2500,
    delay: 400
  })

  
  


ScrollReveal().reveal('.video', {
  delay: 100,
  origin: 'left'
})

ScrollReveal().reveal('.container-lateral', {
    delay: 300,
    origin: 'top',
    interval: 500
  })